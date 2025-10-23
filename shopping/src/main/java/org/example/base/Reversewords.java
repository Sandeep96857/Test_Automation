package src.main.java.org.example.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversewords {

    public static void main(String[] args) {

//        String inputStr = "PREETi Mishra";
//        //ye line Arrays list me string ko trim krke space store kr rhi hain//
//        List<String> words = Arrays.asList(inputStr.trim().split("\\s+"));
//        //yeline reverse kr rhi hain words ko
//        Collections.reverse(words);
//        //ye line reverse word ko join krke store kr rhi hain ek String variable rev me
//        String reversedString = String.join(" ", words);
//        //ye line print kr rhi hain list adn revwords jo ki variable me store hain
//        System.out.println("Reversed words (List): " + reversedString);


                String inputStr = "PREETi Mishra";

                // Input string को words में split करते हैं
                String[] words = inputStr.trim().split("\\s+");

                // एक खाली string variable बनाते हैं
                String reversedString = "";

                // Words को उलटा loop करते हैं
                for (int i = words.length - 1; i >= 0; i--) {
                    // Har word को मौजूदा string में जोड़ते हैं
                    reversedString += words[i];

                    // Last word ke baad space nahi jodna hai
                    if (i > 0) {
                        reversedString += " ";
                    }
                }

                // Final reversed string को print करते हैं
                System.out.println("Reversed words: " + reversedString);
            }

    }
