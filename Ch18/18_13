import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo  {
    public static int cnt = 0 ;

    public static void main (String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[8];

        System.out.print("Enter 8 numbers : ");
        for(int i = 0 ; i < 8 ; ++i)
            arr[i] = input.nextInt();

        System.out.println("The largest number is : "+ findLargest(arr));
    }

    public static int findLargest(int[] arr){
        int mx = arr[0];
        return findLargest(arr, mx,1);
    }

    public static int findLargest(int[] arr,int mx, int i){

        if(i == arr.length)
            return mx;

        if(arr[i] > mx)
            mx = arr[i];

        return findLargest(arr,mx, ++i);
    }
}

