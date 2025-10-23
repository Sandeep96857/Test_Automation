package src.main.java.org.example.base;

public class practice18 {

    public static void main(String[]args){

        String original="Sandeep Kumar";
        String []Cleaned=original.split(" ");
        String withoutspace=String.join("", Cleaned);
        String rev="";

        if(original==null||original.isEmpty()){
            System.out.println("Stringis empty or null:"+original );
        }

        for(int i=withoutspace.length()-1; i>=0;i--){

            rev=rev+withoutspace.charAt(i);
        }
//        System.out.println("OriginalString:"+withoutspace);
        System.out.println("ReveredString:"+rev);
        System.out.println("without space:"+withoutspace);
    }

}
