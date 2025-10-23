/*
package src.main.java.org.example.base;

import java.util.HashSet;
import java.util.Set;

public class CheckstringiscontainsonlyDigits {

    public static String removeduplicate(String str) {

        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (Character ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(removeduplicate("Sandeep"));
    }

}

*/
