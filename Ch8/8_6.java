import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[][] mat1 = new double[3][3];
        double[][] mat2 = new double[3][3];

        System.out.println("Enter the first matrix : ");
        for(int i = 0 ; i < 3 ; ++i)
            for(int j = 0 ; j < 3 ; ++j)
                mat1[i][j] = input.nextDouble();

        System.out.println("Enter the second matrix : ");
        for(int i = 0 ; i < 3 ; ++i)
            for(int j = 0 ; j < 3 ; ++j)
                mat2[i][j] = input.nextDouble();

        double[][] res = matrixMultiplication(mat1,mat2);

        System.out.println("The multiplication of the matrices is : ");
        for(int i = 0 ; i < 3 ; ++i){
            for(int j = 0 ; j < 3 ; ++j)
                System.out.printf("%.1f ",res[i][j]);
            System.out.println();
            }
    }

    public static double[][] matrixMultiplication(double[][] mat1, double[][] mat2)
    {
       double[][] res = new double[3][3];

       for(int i = 0 ; i < 3 ; ++i)
       {
           for(int j = 0 ; j < 3; ++j)
           {
               double val = 0 ;

               for(int k = 0 ; k < 3 ; ++k)
                   val += mat1[i][k] * mat2[k][j];

               res[i][j] = val;
           }
       }

        return res;
    }
}
