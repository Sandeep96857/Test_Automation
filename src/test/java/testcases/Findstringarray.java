package testcases;

public class Findstringarray {

    public static void main(String[] args) {
        String[] str = {"HelloIndia", "Helloworld", "HelloTask", "Hellodelhi", "HelloMumbai", "Pune"};
      


        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("Hello")) {
                System.out.println( " Hello is found at index: " + i);
            }
            else {
        
            System.out.println(  " Hello is notfound at index: " + i);
            }
    
            }
        }
    }
    




