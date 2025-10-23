package base;
//Question-write a code to reverse a string without using inbuilt functions and array.
//Solution
public class Practice {

    public static void main(String[] args) {
        String str="Hello World";
        String reversed=reverse(str);

        System.out.println("Original String :" + str);
        System.out.println("Reverse String :" + reversed);

    }

    public static  String reverse(String str){

        if(str==null || str.isEmpty()){

            return str;
        }
        String Reverse="";

        for(int i=str.length()-1;i>=0;i--) {
            Reverse = Reverse + str.charAt(i);
        }
        return Reverse;
    }

}
//2nd way

