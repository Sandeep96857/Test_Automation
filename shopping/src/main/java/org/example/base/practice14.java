package src.main.java.org.example.base;

public class practice14 {

    public static void main(String[] args) {
        String name = "Sandeep Kumar";

        // स्ट्रिंग को खाली जगह के आधार पर टुकड़ों में तोड़ें
        String[] words = name.split(" ");

        // टुकड़ों को बिना किसी खाली जगह के फिर से जोड़ें
        String nameWithoutSpaces = String.join("", words);

        System.out.println("Original String: " + name);
        System.out.println("String without spaces: " + nameWithoutSpaces);
    }
}
