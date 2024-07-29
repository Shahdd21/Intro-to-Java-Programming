import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        int[][] worksHours = {
                {2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4} ,{3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}
        };

        int [] weeklyHours = new int[8] ;
        int [] indexList = new int[8];

        for(int i = 0 ; i < 8 ; ++i)
            indexList[i] = i;

        getTotalHours(weeklyHours, worksHours);
        descendingSorting(weeklyHours,indexList);

        for(int i = 7 ; i >=0 ; --i)
        {
            System.out.printf("Employee %d works %d weekly \n", indexList[i], weeklyHours[i]) ;
        }
    }

    public static void getTotalHours(int[] weeklyHours, int[][] workHours)
    {
        for(int i = 0 ; i < 8 ; ++i)
        {
            int sum = 0;

            for(int j = 0 ; j < 7 ; ++j)
                sum += workHours[i][j];

            weeklyHours[i]= sum;
        }
    }

    public static void descendingSorting(int[] weeklyHours, int[] indexList)
    {
        for(int i = 0 ; i < weeklyHours.length ; ++i)
        {
            for(int j = 0 ; j < weeklyHours.length-1 ; ++j)
            {
                if (weeklyHours[j] > weeklyHours[j+1])
                {
                    int temp = weeklyHours[j+1];
                    weeklyHours[j+1] = weeklyHours[j];
                    weeklyHours[j] = temp;

                    int tempIdx = indexList[j+1];
                    indexList[j+1] = indexList[j];
                    indexList[j] = tempIdx;
                }
            }
        }
    }
}
