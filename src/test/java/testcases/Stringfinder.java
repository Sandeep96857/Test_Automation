package testcases;

// import java.lang.classfile.TypeAnnotation.TypeArgumentTarget;

public class Stringfinder {


    // @SuppressWarnings("unused")
    public static void main(String[]args){

    String[] arr={"apple", "orange", "banana", "apple", "grape", "orange", "apple"};;


    for(int i=0;i<arr.length;i++){
      for(int j=i+1; j<arr.length;j++){

      if(arr[i].equals(arr[j])){

         System.out.println(arr[i]);
      }

      }


    }

        
    }
    }
