package testcases;

// import java.util.Scanner;

public class practice {

// package arrayprograms;
// 
// public class ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {10, 20, 30, 40}; // Even number of elements
        int[] singleElement = {99};
        int[] emptyArray = {};

        reverseArray(numbers1); // Expected: [5, 4, 3, 2, 1]
        reverseArray(numbers2); // Expected: [40, 30, 20, 10]
        reverseArray(singleElement); // Expected: [99]
        reverseArray(emptyArray); // Expected: []
        reverseArray(null); // Expected: Handles null array
    }

    // Helper method to reverse array in-place
      public static void reverseArray(int[] arr) {
        // System.out.println("\n--- Reversing array: " + java.util.Arrays.toString(arr) + " ---");

        if (arr == null || arr.length <= 1) { // No need to reverse if null, empty, or single element
            // System.out.println("Array is null, empty, or has one element. No reversal needed.");
            // System.out.println("Result: " + java.util.Arrays.toString(arr));
            return;
        }

        int start = 0;
        int end = arr.length - 1;

        // Loop until start pointer crosses or meets end pointer
        while (start < end) {
            // Swap elements at start and end positions
            int temp = arr[start]; // Store value at start
            arr[start] = arr[end]; // Put value from end to start
            arr[end] = temp;       // Put stored value (original start) to end

            // Move pointers towards the center
            start++;
            end--;
        }

        System.out.println("Reversed array: " + java.util.Arrays.toString(arr));
    }
}
















    // public static String reverseStringUsingCharArray(String str) {
    //     // if (str == null || str.isEmpty()) {
    //     //     return str; // Handle null or empty strings
    //     // }

    //     char[] charArray = str.toCharArray(); // Convert string to char array
    //     char[] reversedArray = new char[charArray.length]; // New array for reversed chars

    //     for (int i = 0; i < charArray.length; i++) {
    //         reversedArray[i] = charArray[charArray.length - 1 - i]; // Fill from end of original
    //     }

    //     return new String(reversedArray); // Convert char array back to string
    
    // }

    // public static void main(String[] args) {
    //     System.out.println(reverseStringUsingCharArray("hello"));
    // }

    


  

















    // public static void main(String[]args){

    //  String original="Hello world";

    //  StringBuilder sb = new StringBuilder(original);

    //  System.out.println("Original String:" + original);

    //   String revesred =sb.reverse().toString();

    // System.out.println("Reversed String:" + revesred);

    // }


    
// 
// class SwapNumbers {
//     public static void main(String args[]) {
//         int x, y, temp;
//         System.out.println("Enter x and y");
//         Scanner in = new Scanner(System.in);
//         x = in.nextInt();
//         y = in.nextInt();
//         System.out.println("Before Swapping\nx = " + x + "\ny = " + y);
//         temp = x;
//         x = y;
//         y = temp;
//         System.out.println("After Swapping\nx = " + x + "\ny = " + y);

//     }

// }

