package base;

import java.util.Arrays;

public class pract99 {
    public static void main(String[] args) {

        String S = "Hello world";
        String rev="";

        char [] ch  = S.toCharArray();

        for (int i = ch.length- 1; i >= 0; i--) {

            rev=rev+ch[i];


        }
        System.out.println("revserse : "+ rev);
    }
}


