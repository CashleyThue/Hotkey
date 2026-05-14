import java.util.HashSet;
import java.util.Set;

public class Hotkey {
    Set<Integer> keys = new HashSet<>();
    String command;

    public static Hotkey parse(String line) {
        String[] parts = line.split("=");

        if (parts.length != 2) return null;

        String[] hotkeys = parts[0].split("\\+");

        Hotkey hotkey = new Hotkey();
        hotkey.command = parts[1];

        for (String key : hotkeys) {
            int code = KeyMapper.get(key);

            if (key != null) {
                hotkey.keys.add(code);
            } else {
                System.out.println("Unknown key: " + key);
            }
        }

        return hotkey;
    }
}
