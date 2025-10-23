package testcases;
// package testcases;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class FindmaxminArray{

   public static void main(String[]args){
   
   int[]arr ={10,7,9,1,2};
   
   int smallest = arr[0];
   int largest = arr[0];
   
   for(int i=1;i<arr.length;i++){
     if(arr[i]<smallest){
         smallest=arr[i];
     }
     
     if (arr[i]>largest){
          largest=arr[i];
      }
  }
    System.out.println("SmmalestArray:"+smallest);
    System.out.println("LargestArray:"+largest);
 }
    
}
	
	
