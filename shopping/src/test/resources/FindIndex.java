package base;

public class FindIndex {

    public static void main(String[] args) {

        // The array of integers
        int[] arr = {2, 4, 6, 8};

        // The number we are looking for
        int target = 8;

        // A variable to store the found index. We initialize it to -1
        // to indicate that the number has not been found yet.
//        int foundIndex = -1;

        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to the target
            if (arr[i] == target) {
                // If it's a match, we store the current index
//                foundIndex = i;
//                // We can stop the search because we've found our number
//                break;
                System.out.println("The Target number index  " +  i);

            }
//        }
//
//        // Check if the number was found
//        if (foundIndex != -1) {
//            // If found, print the result
//            System.out.println("The index of " + target + " is: " + foundIndex);
//        } else {
//            // If not found, print a message
        }
    }
}
