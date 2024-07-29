import java.util.* ;
import java.io.* ;

public class Demo  {
    public static void main (String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String fileName = input.next();

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        int sum = 0, cnt = 0 ;
        while(inputFile.hasNext())
        {
            sum += inputFile.nextInt();
            cnt++;
        }

        System.out.printf("Total of scores is % d \nThe average is %d", cnt, sum/cnt);
    }
}
