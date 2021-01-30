class Prime{
static String isPrime(int n){
        boolean flag = false;
        if(n==0 || n==1){
            flag = true;
        }
        else if(n!=0 && n!=1){
            for(int i =2;i<n;i++){
                if (n%i==0){
                     flag = true;
                     break;
                }
            }
        }
       String value =  (flag == true) ? "Not Prime" :  "Prime";
       return value;
   }
static int reverse(int j){
       String nm = Integer.toString(j);
       String nm1 = "";
       for (int i = nm.length()-1;i >= 0;i--){
            nm1 += nm.charAt(i);
       }
       return Integer.parseInt(nm1);
}
    public static void main(String args[]){
        int j = 11;
        System.out.println(isPrime(j));
        System.out.println("Reverse Number is "+isPrime(reverse(j)));



    }


}