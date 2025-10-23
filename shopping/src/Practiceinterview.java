package src;
//1.string is palindrome
public class Practiceinterview {
//    public static Boolean ispalindrome(String str){
//
//        String clndstrng=str.replaceAll("[^a-zA-Z0-9]","");
//        String Reversed="";
//
//        for(int i=clndstrng.length()-1;i>0;i--){
//            char ch=clndstrng.charAt(i);
//            Reversed+=ch;
//        }
//
//        return clndstrng.equals(Reversed);
//
//    }
    public static void main(String[] args) {
        String[]arr={"apple","banana","apple","orange"};
         System.out.println("duplicate element are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}







//public static void main(String[] args) {
//        System.out.println(ispalindrome("a man , a pan"));
//    }
//
//}