class Diamond{

public static void main(String args[])
{
    int n = 5;
//     for(int i=0;i<=n/2;i++){
//         for(int k=i;k<n/2;k++){
//         System.out.print(" ");
//         }
//         for(int j=0;j<i;j++){
//             System.out.print(" *");
//         }
//          System.out.println(" ");
//     }
    for(int i=0;i<n;i++){
         for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int k=i;k<n;k++){
        System.out.print(" *");
        }
    System.out.println(" ");
    }
}
}