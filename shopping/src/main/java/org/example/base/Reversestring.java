package src.main.java.org.example.base;

public class Reversestring {

        public static void main(String[] args) {
            String str = "Hello World";
            String[] words = str.split("\\s+");
            String output = "";

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";

                // reverse the characters of each word
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord += word.charAt(j);
                }

                output += reverseWord; // add reversed word to result

                if (i < words.length - 1) {
                    output += " "; // add space between words
                }
            }

            System.out.println("Output: " + output);
        }
    }



