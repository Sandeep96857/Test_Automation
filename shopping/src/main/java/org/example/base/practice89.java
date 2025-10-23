package src.main.java.org.example.base;

/*import static jdk.internal.org.jline.utils.Colors.s;*/

public class practice89 {
    public static void main(String[] args) {

        String s = "Hello world";
        String[] word = s.split("\\s+"); // word array: ["Hello", "world"]

        // 'world' string ki length nikalne ke liye:
        int worldLength = word[1].length();

        System.out.println("Word at index 1: " + word[1]); // Output: world
        System.out.println("Length of 'world': " + worldLength); // Output: 5
    }
    }
