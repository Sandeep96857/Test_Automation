package src.main.java.org.example.base;

import java.util.HashMap;
import java.util.Map;

public class mapcount {

    public static void main(String[] args) {
        String str = "SandeepKumarDwivedi";

        // एक HashMap बनाएं जहाँ कैरेक्टर और उनकी गिनती स्टोर होगी
        Map<Character, Integer> charCountMap = new HashMap<>();

        // स्ट्रिंग के हर कैरेक्टर पर लूप चलाएं
        for (char ch : str.toCharArray()) {
            // HashMap में कैरेक्टर की गिनती बढ़ाएं
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        // अब, HashMap के एंट्री सेट पर लूप चलाएं और परिणाम प्रिंट करें
        System.out.println("Character counts in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}

