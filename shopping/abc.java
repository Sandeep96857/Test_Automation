public class abc {
        public static void main(String[] args) {
            String s="sandeepkumardwivedi";
            String countchars="";
            for(int i=0;i <s.length(); i++){
                char ch=s.charAt(i);
                boolean allreadycounted=false;
                for(int k=0;k<countchars.length();k++){
                    char ch1=countchars.charAt(k);
                    if(ch==ch1){
                        allreadycounted=true;
                        break;
                    }
                    if(!allreadycounted){
                    }
                }
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(ch==s.charAt(j)){
                        count++;
                    }
                }
                System.out.println("Charcaters:'"+ ch + "'count:" + count);

            }
        }
    }

