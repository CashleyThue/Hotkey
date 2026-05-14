import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;

import java.util.HashMap;
import java.util.Map;

public class KeyMapper {

    public static final Map<String, Integer> KEYS = new HashMap<>();

    static {

        // Modifiers
        KEYS.put("META", NativeKeyEvent.VC_META);
        KEYS.put("CTRL", NativeKeyEvent.VC_CONTROL);
        KEYS.put("CONTROL", NativeKeyEvent.VC_CONTROL);
        KEYS.put("ALT", NativeKeyEvent.VC_ALT);
        KEYS.put("SHIFT", NativeKeyEvent.VC_SHIFT);

        // Navigation / control
        KEYS.put("ENTER", NativeKeyEvent.VC_ENTER);
        KEYS.put("SPACE", NativeKeyEvent.VC_SPACE);
        KEYS.put("TAB", NativeKeyEvent.VC_TAB);
        KEYS.put("ESC", NativeKeyEvent.VC_ESCAPE);
        KEYS.put("ESCAPE", NativeKeyEvent.VC_ESCAPE);
        KEYS.put("BACKSPACE", NativeKeyEvent.VC_BACKSPACE);
        KEYS.put("DELETE", NativeKeyEvent.VC_DELETE);

        // Letters A-Z
        KEYS.put("A", NativeKeyEvent.VC_A);
        KEYS.put("B", NativeKeyEvent.VC_B);
        KEYS.put("C", NativeKeyEvent.VC_C);
        KEYS.put("D", NativeKeyEvent.VC_D);
        KEYS.put("E", NativeKeyEvent.VC_E);
        KEYS.put("F", NativeKeyEvent.VC_F);
        KEYS.put("G", NativeKeyEvent.VC_G);
        KEYS.put("H", NativeKeyEvent.VC_H);
        KEYS.put("I", NativeKeyEvent.VC_I);
        KEYS.put("J", NativeKeyEvent.VC_J);
        KEYS.put("K", NativeKeyEvent.VC_K);
        KEYS.put("L", NativeKeyEvent.VC_L);
        KEYS.put("M", NativeKeyEvent.VC_M);
        KEYS.put("N", NativeKeyEvent.VC_N);
        KEYS.put("O", NativeKeyEvent.VC_O);
        KEYS.put("P", NativeKeyEvent.VC_P);
        KEYS.put("Q", NativeKeyEvent.VC_Q);
        KEYS.put("R", NativeKeyEvent.VC_R);
        KEYS.put("S", NativeKeyEvent.VC_S);
        KEYS.put("T", NativeKeyEvent.VC_T);
        KEYS.put("U", NativeKeyEvent.VC_U);
        KEYS.put("V", NativeKeyEvent.VC_V);
        KEYS.put("W", NativeKeyEvent.VC_W);
        KEYS.put("X", NativeKeyEvent.VC_X);
        KEYS.put("Y", NativeKeyEvent.VC_Y);
        KEYS.put("Z", NativeKeyEvent.VC_Z);

        // Numbers 0-9
        KEYS.put("0", NativeKeyEvent.VC_0);
        KEYS.put("1", NativeKeyEvent.VC_1);
        KEYS.put("2", NativeKeyEvent.VC_2);
        KEYS.put("3", NativeKeyEvent.VC_3);
        KEYS.put("4", NativeKeyEvent.VC_4);
        KEYS.put("5", NativeKeyEvent.VC_5);
        KEYS.put("6", NativeKeyEvent.VC_6);
        KEYS.put("7", NativeKeyEvent.VC_7);
        KEYS.put("8", NativeKeyEvent.VC_8);
        KEYS.put("9", NativeKeyEvent.VC_9);

        // Function keys
        KEYS.put("F1", NativeKeyEvent.VC_F1);
        KEYS.put("F2", NativeKeyEvent.VC_F2);
        KEYS.put("F3", NativeKeyEvent.VC_F3);
        KEYS.put("F4", NativeKeyEvent.VC_F4);
        KEYS.put("F5", NativeKeyEvent.VC_F5);
        KEYS.put("F6", NativeKeyEvent.VC_F6);
        KEYS.put("F7", NativeKeyEvent.VC_F7);
        KEYS.put("F8", NativeKeyEvent.VC_F8);
        KEYS.put("F9", NativeKeyEvent.VC_F9);
        KEYS.put("F10", NativeKeyEvent.VC_F10);
        KEYS.put("F11", NativeKeyEvent.VC_F11);
        KEYS.put("F12", NativeKeyEvent.VC_F12);

        // Common symbols
        KEYS.put("SEMICOLON", NativeKeyEvent.VC_SEMICOLON);
        KEYS.put("EQUALS", NativeKeyEvent.VC_EQUALS);
        KEYS.put("COMMA", NativeKeyEvent.VC_COMMA);
        KEYS.put("PERIOD", NativeKeyEvent.VC_PERIOD);
        KEYS.put("SLASH", NativeKeyEvent.VC_SLASH);
        KEYS.put("BACK_SLASH", NativeKeyEvent.VC_BACK_SLASH);
        KEYS.put("OPEN_BRACKET", NativeKeyEvent.VC_OPEN_BRACKET);
        KEYS.put("CLOSE_BRACKET", NativeKeyEvent.VC_CLOSE_BRACKET);
        KEYS.put("MINUS", NativeKeyEvent.VC_MINUS);
        KEYS.put("QUOTE", NativeKeyEvent.VC_QUOTE);
        KEYS.put("BACKQUOTE", NativeKeyEvent.VC_BACKQUOTE);
    }

    public static Integer get(String key) {
        return KEYS.get(key.toUpperCase());
    }
}