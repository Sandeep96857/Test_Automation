package src.main.java.org.example.base;

public class Vowel_Consonant_Separate {

    public static void main(String[] args) {

        String str = "JAi Shree Ram";
        String vowels=str.toLowerCase().replaceAll("[^aeiouAEIOUE]","");
        String consonant=str.toLowerCase().replaceAll("[aeiouAEIOUE]","");

        System.out.println("Vowels:"+vowels);
        System.out.println("Vowels:"+consonant);
    }
}
//        String Input = "jai shree ram";
//
//        StringBuilder vowels = new StringBuilder();
//        StringBuilder Consonants = new StringBuilder();
//        String all_vowels = "aeiouAEIOU";
//
//        for (char ch : Input.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if (all_vowels.indexOf(ch) != -1) {
//                    vowels.append(ch);
//                } else {
//                    Consonants.append(ch);
//                }
//            }

// */

//        String input = "jai shree ram";
//        String vowels = "";
//        String Consonants = "";
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                vowels += ch;
//            } else if (ch >= 'a' && ch <= 'z') {
//                Consonants += ch;
//            }
//        }

//        System.out.println("vowels:"+vowels );
//        System.out.println("Consonants:"+Consonants );

//        }
//        System.out.println("vowels:" + vowels.toString());
//        System.out.println("consonants:" + Consonants.toString());
//    }
//    }




