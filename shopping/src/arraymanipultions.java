package src;

public class arraymanipultions {

    public static void main(String[] args) {
         String[]arr={"apple","banana","apple","orange"};
//        int[] arr = {10, 20, 30, 40, 20, 50, 21, 21, 60, 20, 21};
//        System.out.println("duplicate element are:");
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == -1) continue; // already counted
//            boolean isDuplicate = false; // flag for this element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
//                    arr[j] = -1;     // mark visited
//                    isDuplicate = true; // element repeated
                }
            }
//            if (isDuplicate) {
//                System.out.println(arr[i]);
            }
        }
    }




