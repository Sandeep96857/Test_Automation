package testcases;

import java.util.HashSet;
import java.util.Set;

public class Practice {

public static void main(String[] args) {

    String str="hello word";
    String rev="";
    for(int i =str.length()-1;i<=0;i--){
    char ch=str.charAt(i);
    rev+=ch;

    }
    System.out.println("reverseword:"+rev);
    
}

}


