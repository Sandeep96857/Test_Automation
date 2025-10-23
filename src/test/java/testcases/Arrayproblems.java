package testcases;

import java.util.Arrays;

public class Arrayproblems {

    /**
     * Finds the missing number in an array of integers from 1 to n.
     * The array is assumed to contain n-1 numbers and have no duplicates.
     *
     * @param arr The input array containing n-1 numbers.
     * @param n   The expected upper bound of the numbers (i.e., from 1 to n).
     * @return The missing number.
     */
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of all numbers from 1 to n using the formula: n * (n + 1) / 2
        // This is the expected sum if no number was missing.
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the elements present in the given array.
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The difference between the expected sum and the actual sum is the missing number.
        return expectedSum - actualSum;
    }

    /**
     * Main method to demonstrate the findMissingNumber solution.
     */
    public static void main(String[] args) {
        // Sample data for the problem
        int[] arr1 = {1, 2, 4, 6, 3, 7, 8};
        int n1 = 8; // The numbers should be from 1 to 8

        System.out.println("--- Find Missing Number ---");
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Expected range: 1 to " + n1);

        int missingNumber = findMissingNumber(arr1, n1);
        System.out.println("The missing number is: " + missingNumber); // Output should be 5
    }
}


