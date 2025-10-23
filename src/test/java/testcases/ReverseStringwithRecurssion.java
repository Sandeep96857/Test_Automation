package testcases;

public class ReverseStringwithRecurssion {

    public static void main(String[] args) {
        String originalString = "Sandeep Dwivedi";
        String reversedString = reverseStringRecursive(originalString);
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("Reversed String: \"" + reversedString + "\"");
    }

    public static String reverseStringRecursive(String str) {
        // Base case: if the string is null, empty, or has only one character, it's already reversed.
        if (str == null || str.length() <= 1) {
            return str;
        }

      
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }
}


  // Recursive step:
        // Take the last character, and append it to the result of reversing the rest of the string.
        // Example: reverse("abc") = 'c' + reverse("ab")
        // reverse("ab") = 'b' + reverse("a")
        // reverse("a") = "a" (base case)
        // So, "b" + "a" = "ba"
        // Then, "c" + "ba" = "cba"
        
