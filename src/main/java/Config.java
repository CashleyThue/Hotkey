import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Config {
    public static ArrayList<Hotkey> get() throws IOException {
        Path configDir = Path.of(
                System.getProperty("user.home"),
                ".config",
                "hotkeys"
        );

        Path configFile =
                configDir.resolve("hotkeys.conf");

        if (!Files.exists(configFile)) {
            Files.createDirectories(configDir);

            Files.writeString(
                    configFile,
                    """
                    # Hotkey config
            
                    CTRL+ALT=dolphin
                    """
            );
        }

        ArrayList<Hotkey> hotkeys = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(configFile.toString()))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("#") || line.isBlank()) {
                    continue;
                }
                Hotkey hk = Hotkey.parse(line);

                if (line != null) {
                    hotkeys.add(hk);
                }
            }
        } catch (IOException e) {
            System.out.println("Read failed");
        }

        return hotkeys;
    }
}
