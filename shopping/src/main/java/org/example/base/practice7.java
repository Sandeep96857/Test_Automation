package base;

import java.util.Arrays;

public class practice7 {

    public static void main(String[] args) {

        String Target="AABBABABBABAAB";

        char[] ch=Target.toCharArray();

         Arrays.sort(ch);

         String S=new String(ch);

         System.out.println("this is new");

        System.out.println("Original String: " + Target);
        System.out.println("Sorted String: " + S);

    }
}
