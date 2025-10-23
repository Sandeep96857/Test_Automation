package src.main.java.org.example.base;

    public class CharacterCounter {

        public static void main(String[] args) {
            // आपकी स्ट्रिंग जिसमें कैरेक्टर की गिनती करनी है
                String str = "SandeepKumarDwivedi";

            // 256 के आकार का एक array बनाएं, जो सभी ASCII कैरेक्टर के लिए पर्याप्त है
            int[] arr = new int[256];

            // स्ट्रिंग के हर कैरेक्टर पर लूप चलाएं
            for (char ch : str.toCharArray()) {
                // कैरेक्टर की ASCII वैल्यू को array के index के रूप में उपयोग करें
                // और उस index पर गिनती 1 बढ़ा दें
                arr[ch]++;
            }


            // अब, उन कैरेक्टर को प्रिंट करें जिनकी गिनती 0 से अधिक है
            System.out.println("Character counts in the string:");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    // index को वापस कैरेक्टर में बदलें और उसकी गिनती प्रिंट करें
                    System.out.println("'" + (char) i + "' : " + arr[i]);
                }
            }
        }
    }

//number counter
//        import java.util.*;
//
//    public class DuplicateWithList {
//        public static void main(String[] args) {
//            int[] arr = {10, 20, 30, 40, 20, 40, 50};
//
//            List<Integer> list = new ArrayList<>();
//            for (int num : arr) {
//                list.add(num);
//            }
//
//            System.out.println("Duplicate numbers with counts:");
//            for (int i = 0; i < list.size(); i++) {
//                int num = list.get(i);
//                int freq = Collections.frequency(list, num);
//
//                if (freq > 1) {
//                    System.out.println(num + " → " + freq);
//                    // Taaki ek number bar-bar print na ho
//                    list.removeAll(Collections.singleton(num));
//                    i--; // remove ke baad index adjust karna zaroori
//                }
//            }
//        }
//    }

public class DuplicateCount {
 public static void main(String[] args) {
 int[] arr = {10, 20, 30, 40, 20, 40, 50};
//
//      boolean[] visited = new boolean[arr.length]; // mark karne ke liye
//
//        for (int i = 0; i < arr.length; i++) {
//            if (visited[i]) continue;  // agar already count ho gaya toh skip
//            int count = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    visited[j] = true;
//                }
//            }
//            if (count > 1) {
//                System.out.println(arr[i] + " → " + count);
//            }
//        }
//    }
//}
