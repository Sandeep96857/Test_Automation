public class ReverseString{
  public static void main(String[]args){
    String str="HelloWorld"; //output : peednas olleh dlrow
    String rev="";
    String[]word=str.split("");
    for(int i=word.length-1;i>=0;i--){
       rev=word[i];
    }
    String temp=word[0];
        word[0]=word[1];
         word[1]=temp;
    String swapped=String.join("", word);
    System.out.println("swppaedrevsreword:"+swapped );
  }     
}
//dlrow olleh peednaS
