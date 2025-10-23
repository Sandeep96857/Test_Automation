package src.main.java.org.example.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ABC {

    public static void main(String[] args) {

        String str = "Sandeep Dwivedi";

        List<String> words = Arrays.asList(str.trim().split("\\s+"));
        Collections.reverse(words);
        String rev = String.join(" ", words);
        System.out.println("Reversed words (List): " + words);
    }
}