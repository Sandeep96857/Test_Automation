package src.main.java.org.example.base;

import java.util.HashSet;
import java.util.Set;

public class Practicejava88 {

//    public static String duplicateremove(String str){

////        Set<Character> seen= new HashSet<>();
//        StringBuilder result =new StringBuilder();
//
////        for( char ch: str.toCharArray()){
////            if(!seen.contains(ch)) {
//                seen.add(ch);
//                result.append(ch);
//            }
//        }
//           return result.toString();
//
//    }

//    public static void main(String[] args) {
//        String input = "programming";
//        System.out.println(duplicateremove(input));
//    }
//}
public static void main(String[] args) {

    String str="Programming";

    String result="";

    for( int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        boolean isduplicate=false;
        for( int j=0;j<result.length();j++) {
            char ch1 = result.charAt(j);
            if (ch1 == ch) {
                isduplicate = true;
                break;
            }
        }
            if(!isduplicate){
                result+=ch;
            }
            System.out.println("removing duplicate:"+result);
        }
      }


}