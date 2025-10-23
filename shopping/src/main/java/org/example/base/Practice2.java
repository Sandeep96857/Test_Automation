package base;

public class Practice2 {

    public static void main(String[] args) {
        String str="Hello World";
        String reversed=reverse(str);

        System.out.println("Original String :" + str);
        System.out.println("Reverse String :" + reversed);

    }

    public static  String reverse(String str){

        if(str==null || str.length()<=1){

            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
