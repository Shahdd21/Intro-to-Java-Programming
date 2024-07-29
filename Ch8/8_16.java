import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
      int[][] matrix = new int[6][2];
      initializeMatrix(matrix);

      sortMatrix(matrix);
      displayMatrix(matrix);
    }

    public static void initializeMatrix(int[][] matrix)
    {
        for(int i = 0 ; i < 6 ; ++i)
            for(int j = 0 ; j < 2 ; ++j)
                matrix[i][j] = (int)(Math.random()*10) ;
    }
    public static void displayMatrix(int[][] matrix)
    {
        for(int i = 0 ; i < 6 ; ++i) {
            for (int j = 0; j < 2; ++j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void sortMatrix(int[][] matrix)
    {
        for(int i = 0 ; i < 6 ; ++i)
        {
            for(int j = 0 ; j < 5; ++j)
            {
                if(matrix[j][0] > matrix[j+1][0])
                {
                    int temp = matrix[j+1][0];
                    matrix[j+1][0] = matrix[j][0];
                    matrix[j][0] = temp;
                }

                else if(matrix[j][0] == matrix[j+1][0])
                {
                    if(matrix[j][1] > matrix[j+1][1])
                    {
                        int temp = matrix[j+1][1];
                        matrix[j+1][1] = matrix[j][1];
                        matrix[j][1] = temp;
                    }
                }
            }
        }
    }
}
