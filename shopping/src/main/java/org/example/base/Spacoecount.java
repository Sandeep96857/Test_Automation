package src.main.java.org.example.base;

public class Spacoecount {

    public static void countspace(String Str) {

        int spcount = 0;

        for (char ch : Str.toCharArray()) {

            if (ch == ' ') {
                spcount++;
            }
        }
        System.out.println("no of spaces:"+spcount);
    }

    public static void main(String[] args) {
        String Data="Hello World";
       countspace(Data);
    }
    }


