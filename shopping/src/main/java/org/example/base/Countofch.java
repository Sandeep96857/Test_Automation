//package src.main.java.org.example.base;
//
//public class Countofch {
//
//    public static void main(String[] args) {
//
//        String str = "Helloworld";
//        countChars(str);
//
//    }
//
//    public static void countChars(String str) {
//
//        String countedchars = "";
//        for (int i = 0; i < str.length(); i++) {
//            char currentchar = str.charAt(i);
//            if (countedchars.indexOf(currentchar) == -1) {
//                int count = 0;
//                for (int j = 0; j < str.length(); j++) {
//                    if (str.charAt(j) == currentchar) {
//                        count++;
//                    }
//                }
//
//            }
//            System.out.println("Character" + currentchar + "occurs" + count + "times");
//            countedchars = countedchars + currentchar;
//        }
//    }
//
//}
//
//
//
//
//
