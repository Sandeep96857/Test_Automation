package testcases;

public class StringLengthFinder {

    // The main method is the entry point for all Java applications.
    public static void main(String[] args) {

        // 1. Declare and initialize a String variable.
        String myString = "This is a sample string.";

        // 2. Use the built-in .length() method to get the number of characters.
        // The .length() method returns an integer value.
        int stringLength = myString.length();

        // 3. Print the result to the console.
        // The output will be the integer value of the string's length.
        System.out.println("The original string is: \"" + myString + "\"");
        System.out.println("The length of the string is: " + stringLength);

        // Another example with a different string.
        String emptyString = "";
        int emptyLength = emptyString.length();
        System.out.println("\nThe original string is: \"" + emptyString + "\"");
        System.out.println("The length of the empty string is: " + emptyLength);
    }
}


