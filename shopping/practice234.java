public class practice234 {

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 6, 0};
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        boolean found = false;


        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                System.out.println("Equilibrium number: " + arr[i]);
                found = true;
                break;
            }

            leftSum += arr[i];
        }

        if (!found) {
            System.out.println("No Equilibrium Number Found");
        }
    }
}


