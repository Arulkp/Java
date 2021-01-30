class Program {

public static void main(String args[]){

    String s = "Googl";
    for(int i=0;i<s.length();i++){
        int j = s.length() -1 - i;
            for(int k=0;k<s.length();k++){
            if(k==i || k==j){
                System.out.print(s.charAt(k));
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");


    }
}

}