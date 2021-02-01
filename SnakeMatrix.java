import java.util.*;
class SnakeMatrix
{
    static int k =0;
    static int odd(int mat){
        for (int j = 0; j < mat; j++){
                    System.out.print(k++ +" ");
                }
                return k;
                }
    static int  even(int mat){
            for (int j = mat - 1; j >= 0; j--){
                    System.out.print(k+j +" ");
                }
                 k = k+mat;
                 return k;
    }
    static void print(int mat)
    {
        for (int i = 0; i < mat; i++)
        {
            int n = (i%2 != 0)?odd(mat):even(mat);
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        int mat = 10;
        print(mat);
    }
    }
