import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo  {
    public static int cnt = 0 ;

    public static void main (String[] args) throws Exception {

        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("The fibonacci of the number is : "+ fib(num));
        System.out.println("The number of calls to get the number is : "+ cnt);
    }

    public static int fib(int idx){

        cnt++;

        if(idx == 0)
            return 0;

        if(idx == 1)
            return 1;

        return fib(idx-1) + fib(idx-2);
    }
}

