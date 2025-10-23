package src.main.java.org.example.base;

class Main {
    public static void main(String[] args) {

        String [] str={"Helloword","Helloindia","helloindia","Hellopune"};

        String Target="Hello";

        for(int i=0;i<str.length;i++){
            if(str[i].toLowerCase().contains(Target.toLowerCase())){
                System.out.println(Target+ " is found at index:" + i);
            }
            else{
                System.out.println(Target+ " is not found at index:" + i);

            }

        }
    }
}