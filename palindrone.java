class Palindrom{
    public static void main(String args[]){
         String s = "TATATTATzAT";
         String old = s.replace(" ","");
         String s1 = "";
         for(int i=old.length()-1;i>=0;i--){
           s1 += old.charAt(i);
         }
         System.out.println(s1);
         System.out.println(old);
         System.out.println(s1.equals(old));


        }

}