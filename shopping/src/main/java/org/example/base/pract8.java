package base;

import java.util.Arrays;
import java.util.Collections;

public class pract8 {


        public static void main(String[] args) {
            // We use the wrapper class Integer instead of the primitive int
            // so we can use Collections.reverseOrder() to sort in descending order.
            Integer[] arr = {2, 4, 55, 6};

            // Print the original array
            System.out.println("Original array: " + Arrays.toString(arr));

            // Sort the array in descending order
            // The Collections.reverseOrder() method provides a comparator for reverse sorting.
            Arrays.sort(arr, Collections.reverseOrder());

            // Print the sorted array
            System.out.println("Sorted array (descending): " + Arrays.toString(arr));
        }
    }
