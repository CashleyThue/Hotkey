import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Daemon implements NativeKeyListener {
    static HashSet<Integer> keys_pressed = new HashSet<>();
    ArrayList<Hotkey> hks;
    Set<Hotkey> triggered = new HashSet<>();

    public Daemon() throws IOException {
        hks = Config.get();
    }

    public void nativeKeyPressed(NativeKeyEvent e) {
        keys_pressed.add(e.getKeyCode());

        for (Hotkey hk : hks) {
            if (keys_pressed.containsAll(hk.keys)) {
                if (!triggered.contains(hk)) {
                    triggered.add(hk);

                    try {
                        ProcessBuilder pb = new ProcessBuilder(hk.command.split(" "));
                        pb.directory(new File(System.getProperty("user.home")));
                        pb.inheritIO();
                        pb.start();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        }
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
        keys_pressed.remove(e.getKeyCode());
        triggered.removeIf(hk ->
                !keys_pressed.containsAll(hk.keys)
        );
    }

    public static void main(String[] args) throws IOException {
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new Daemon());
    }
}