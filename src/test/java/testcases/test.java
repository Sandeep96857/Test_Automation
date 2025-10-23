package testcases;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class test{

   public static void main(String[]args){
   
    String original ="Hello world";
// 	StringBuilder sb = new StringBuilder(original);
// 	String reversed=sb.reverse().toString();
// 	System.out.println("Original String :" + original);
// 	System.out.println("Reversed String : " +reversed);
   if(original==null ||original.isEmpty()){
    System.out.println("OriginalString:" + original);
     System.out.println("ReverseString:" + original);
       return;
    }
  char[]charArray =original.toCharArray();
  char[]reversArray=new char[charArray.length];
  
      for(int i = 0; i<charArray.length; i++){
     reversArray[i]= charArray[charArray.length-1-i];
   }
    String reversed=new String(reversArray);

  System.out.println("ReversalString:" + reversed);
//   System.out.println("OriginalString:" + original);

  
   }
	
	
	



}
