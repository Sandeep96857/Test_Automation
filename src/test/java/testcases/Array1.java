package testcases;

public class Array1 {

    public static void main(String[]args){


        int [] arr ={1,2,3,4,5,6,7,8,9};

        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1;i<arr.length;i++){

            if (i<smallest){

           smallest = arr[i];
            }
            if(i>largest){
              largest=arr[i];

            }

        }
               System.out.println("s"+ smallest);
                System.out.println("l"+ largest);

    }

}
        

    //     // int[] arr ={1,9,1,2,567,4,5,6,82};

    //     // int Duplicate = arr[0];

    //     // for(int i=1;i<arr.length;i++){

    //     // if(i==Duplicate){
    //     //     Duplicate=arr[i];
    //     // }

    //     // }
    // //    System.out.println("element is Dupliacte:"+ Duplicate);
    //    String myString="hello";

    //    String ReversalString=reverse(myString);

    //    System.out.println("OriginalString"+myString);
    //    System.out.println("ReversalString"+ReversalString
    //    );



    // }

    // private static String reverse(String myString) {
    //     // TODO Auto-generated method stub

    //     if(myString==null || myString.isEmpty()){

    //         return myString;
    //     }

    //     String Reversed ="";

    //     for(int i=myString.length()-1; i>=0;i--){
    //       Reversed = Reversed+myString.charAt(i);
    //     }
    //     return Reversed;

    // }
    // }


    



