package src.main.java.org.example.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class wordRev {

    public static void main(String[] args) {

            String str="I love java";

            List<String> word=Arrays.asList(str.trim().split("\\s+"));
            Collections.reverse(word);
            String Rev=String.join(" ",word);
            System.out.println("Reversed String(List):"+ Rev);
        }
}
