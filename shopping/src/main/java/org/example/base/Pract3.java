/*
package base;



    public class DuplicateCount {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 20, 40, 50};

            boolean[] visited = new boolean[arr.length]; // mark karne ke liye

            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) continue;  // agar already count ho gaya toh skip
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                        if (count > 1) {
                            System.out.println(arr[i] + " → " + count);
                        }

                    }
                }
            }
        }
    }*/
