package src.main.java.org.example.base;

//import sun.jvm.hotspot.utilities.ArrayOfU1Array;

import java.util.Arrays;

public class smallestlargestarray {

    public static void main(String[] args) {
        int[] arr={10,20,40,90,80};
        Arrays.sort(arr);
        int smallest=arr[0];
        int larest=arr[arr.length-1];
        System.out.println("Sorted array:"+ Arrays.toString(arr));



//        for(int i=0; i<arr.length;i++){
//
//            if(i>smallest){
//
//                smallest=arr[i];
//            }
//            if(i<larest){
//                larest=arr[i];
//            }
//        }
        System.out.println("smallest:"+smallest);
        System.out.println("largest:"+larest);
    }
}
