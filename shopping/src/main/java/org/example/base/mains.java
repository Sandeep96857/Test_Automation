package src.main.java.org.example.base;

public class mains{
    public static void main(String[]args){
        String str="Sandeep Dwivedi";
        String countchars = "";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean allreadycounted=false;

            for(int k=0;k<countchars.length();k++){
                if(ch == countchars.charAt(k)){
                    allreadycounted=true;
                    break;
                }
            }
            if(!allreadycounted){

            }
            int count = 0;
            for(int j = 0; j<str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                }

            }
            System.out.println("characters : "+ ch + "nooftimes:" + count);
        }
    }
}



