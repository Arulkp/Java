class Five{

    public static void main(String args[]){
    int n[] = {1,2,3,4,5,6,7,8,9,10};
    int o = 0;
    String total[] = new String[10] ;
    int res[][] = new int[10][10];
    for (int i = 0;i<n.length;i++){
        for(int j=i+1;j<n.length;j++){
            if((n[i]+n[j])==5){
                total[o] = Integer.toString(n[i]) +"," +Integer.toString(n[j]);
                o+=1;
            }
        }
    }
    for(int x=0;x<total.length;x++){
        System.out.println(total[x]);
    }

    }
}