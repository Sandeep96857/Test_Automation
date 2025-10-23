package packages.base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class mains {
    
    public static int repeatingelement(int[] arr){
        Map<Integer, Integer> seen =new  HashMap<>();
        for(int number :arr){
           if(seen.containsKey(number)){
               return number;
           } 
           else{
               seen.put(number, 1);
           }
       }
          return -1;
    }
    
 public static void main(String[]args){
    int [] data={10,10,30,40};
    int result =repeatingelement(data);
    if(result != -1){
   System.out.println("1st repeating element:"+ result);  
    }
    else{
    System.out.println("no  repeating element found:");  
    }
 }

}


