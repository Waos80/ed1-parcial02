package ed.lab;

import java.util.HashMap;

public class E02Logger {
    HashMap<String, Integer> map;

    public E02Logger() {
        this.map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message)) {
            map.put(message, timestamp + 10);
            return true;
        }

        return map.get(message) <= timestamp;
    }

}
