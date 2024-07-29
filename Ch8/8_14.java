import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the matrix : ");
        int n = input.nextInt();

      int[][] matrix = new int[n][n];

      for(int i = 0 ; i < n ; ++i)
          for(int j = 0 ; j < n ; ++j)
              matrix[i][j] = (int)(Math.random()*2) ;

      displayMatrix(matrix,n);

      searchRows(matrix,n);
      searchColumns(matrix,n);
      searchMainDiagonal(matrix,n);
      searchSubDiagonal(matrix,n);
    }

    public static void displayMatrix(int[][] matrix, int n)
    {
        for(int i = 0 ; i < n ; ++i) {
            for (int j = 0; j < n; ++j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void searchRows(int[][] matrix, int n)
    {
        boolean found = false;
        for(int i = 0 ; i < n ; ++i)
        {
            int cnt = 0 ;

            for(int j = 0 ; j < n ; ++j)
                cnt += matrix[i][j];

            if(cnt == 0) {
                System.out.println("All zeroes on row " + i);
                found = true;
            }

            if (cnt == n) {
                System.out.println("All ones on row " + i);
                found = true;
            }
        }

        if(!found)
            System.out.println("No same numbers on a row");
    }

    public static void searchColumns(int[][] matrix, int n)
    {
        boolean found = false;
        for(int i = 0 ; i < n ; ++i)
        {
            int cnt = 0 ;

            for(int j = 0 ; j < n ; ++j)
                cnt += matrix[j][i];

            if(cnt == 0) {
                System.out.println("All zeroes on column " + i);
                found = true;
            }

            if (cnt == n) {
                System.out.println("All ones on column " + i);
                found = true;
            }
        }

        if(!found)
            System.out.println("No same numbers on a column");
    }

    public static void searchMainDiagonal(int[][] matrix, int n)
    {
        int cnt = 0;
        for(int i = 0 ; i < n ; ++i)
            cnt += matrix[i][i];

        if(cnt == 0 )
            System.out.println("All zeroes on the main diagonal");

        else if (cnt == n)
            System.out.println("All ones on the main diagonal");

        else
            System.out.println("No same numbers on the main diagonal");
    }

    public static void searchSubDiagonal(int[][] matrix, int n)
    {
        int i = 0 , j = n-1, cnt = 0;

        while(i < n && j >= 0)
        {
            cnt += matrix[i][j];

            i++; j--;
        }

        if(cnt == 0 )
            System.out.println("All zeroes on the sub diagonal");

        else if (cnt == n)
            System.out.println("All ones on the sub diagonal");

        else
            System.out.println("No same numbers on the sub diagonal");
    }
}
