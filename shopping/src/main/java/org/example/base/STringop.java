package src.main.java.org.example.base;

import java.util.Arrays;

public class STringop {


        public static void isanagram(String str1,String str2){

            String s1=str1.replaceAll("\\s\\+", "");
            String s2=str2.replaceAll("\\s\\+", "");
            if(s1.length()!=s2.length()) {

                System.out.println("string is inagrame");
                return;
            }

            char [] ch1=str1.toCharArray();
            char [] ch2=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)){
                System.out.println("string is inagrame");
            }
            else {

                System.out.println("string is not inagrame");
            }
        }

        public static void main(String[] args) {
            isanagram("silent","listen");
        }
    }
































//        int sum=0;
//        String part1=sb.replaceAll("\\D+"," ");
//        StringBuilder temp=new StringBuilder(part1);
//        for(int i=0;i<part1.length();i++){
//            char ch =part1.charAt(i);
//            if(character.isDigit(ch)){
//                temp.append(ch);
//            }
//            if (temp.length() > 0) { // agar number complete ho gaya
//                int num = Integer.parseInt(temp.toString());
//                System.out.println(num); // print number
//                sum += num;              // add to sum
//                temp.setLength(0);       // reset temp
//            }
//        }
//        System.out.println("Sum: " + sum);











