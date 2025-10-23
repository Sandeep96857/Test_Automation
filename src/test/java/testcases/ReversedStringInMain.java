package testcases;

// package testcases;

public class ReversedStringInMain {

    public static void main(String[] args) { // Standard void main method

        String original = "34567"; // The string we want to reverse

        //Handle null or empty strings

        if (original == null || original.isEmpty()) {
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + original); // For empty/null, reversed is the same
            return; // Exit the main method
        }

        // @SuppressWarnings("unused")
        char[] charArray = original.toCharArray(); // Convert string to char array
        char[] reversedArray = new char[charArray.length]; // New array for reversed chars

        // Loop to fill the reversedArray from the end of the original charArray
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }

        String reversed = new String(reversedArray); // Convert char array back to string

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}


//     // // public static void main(String[] args) {
//     //     System.out.println(reverseStringUsingCharArray(str));
//     // }

// }
