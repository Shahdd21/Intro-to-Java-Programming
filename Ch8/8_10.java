import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
      int[][] matrix = new int[4][4];

      for(int i = 0 ; i < 4 ; ++i)
          for(int j = 0 ; j < 4 ; ++j)
              matrix[i][j] = (int)(Math.random()*2) ;

      int mxRow = getMaxRow(matrix);
      int mxCol = getMaxCol(matrix);

      displayMatrix(matrix);

      System.out.println("The largest row index : " + mxRow);
      System.out.println("The largest col index : " + mxCol);
    }

    public static int getMaxRow(int[][] matrix)
    {
        int mxRow = -1, mxIndex = -1;
        for(int i = 0 ; i < 4 ; ++i)
        {
            int cntRow = -1 ;

            for(int j = 0 ; j < 4 ; ++j)
                cntRow += matrix[i][j];

            if(mxRow < cntRow) {
                mxRow = cntRow;
                mxIndex = i;
            }
        }

        return mxIndex;
    }

    public static int getMaxCol(int[][] matrix)
    {
        int mxCol = -1, mxIndex = -1;
        for(int i = 0 ; i < 4 ; ++i)
        {
            int cntCol = -1;
            for(int j = 0 ; j < 4 ; ++j)
                cntCol += matrix[j][i];

            if(mxCol < cntCol) {
                mxCol = cntCol;
                mxIndex = i;
            }
        }

        return mxIndex;
    }

    public static void displayMatrix(int[][] matrix)
    {
        for(int i = 0 ; i < 4 ; ++i){
            for(int j = 0 ; j < 4 ; ++j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
            }
    }
}
