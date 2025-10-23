package base;

public class FindDuplicates {

    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "banana", "apple", "grape", "orange", "apple"};

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}