package base;

public class pract4 {

    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverse(str);

        System.out.println("Original String :" + str);
        System.out.println("Reverse String :" + reversed);

    }

    public static String reverse(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();

        for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
            // Swap the characters at the left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }

        // Convert the character array back to a new string and return it
        return new String(charArray);
    }
}