package src.main.java.org.example.base;

import java.util.ArrayList;
import java.util.List;

class main {

    public static void main(String[] args) {
        String str= "Today is a beautiful Day";
         str=str.toLowerCase();
        String vowels = "aeiou";
        int[]count=new int[vowels.length()];
        for( int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < vowels.length(); j++) {
                char ch1 = vowels.charAt(j);
                if (ch == ch1) {
                    count[j]++;
                }
            }
        }
        System.out.println("vowels count:");
        for (int i = 0; i < vowels.length(); i++) {
            System.out.println(vowels.charAt(i) + " : " + count[i]);
        }
    }
}



