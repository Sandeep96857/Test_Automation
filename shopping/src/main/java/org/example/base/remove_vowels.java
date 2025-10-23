package src.main.java.org.example.base;

public class remove_vowels {

    public static void main(String[] args) {

        String input="Jai Shree Ram";

        String cleanedString= input.replaceAll("[aeiouAEIOU]","");

        System.out.println("cleaned String after vowel removed:"+ cleanedString);
    }

}
