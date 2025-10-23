package src.main.java.org.example.base;

import java.util.Arrays;

public class isanagram1 {


        public static void isanagram(String str1,String str2) {
            String s1=str1.replaceAll("\\s\\+", "");
            String s2=str2.replaceAll("\\s\\+", "");
            if(s1.length()!=s2.length()) {

                System.out.println("string is not inagrame");
                return;
            }

            char [] ch1=str1.toCharArray();
            char [] ch2=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)){
                System.out.println("string is inagrame");
            }
            else {

                System.out.println("string is not inagrame");
            }
        }
        public static void main(String[]args) {

            isanagram("Hello","heoll");
        }
    }


