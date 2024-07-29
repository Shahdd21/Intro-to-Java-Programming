import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo  {
    public static int cnt = 0 ;

    public static void main (String[] args) throws Exception {

        System.out.print("Enter a string : ");
        Scanner input = new Scanner(System.in);
        String s = input.next();

        System.out.print("The reversed string is : ");
        reverseDisplay(s);
    }

    public static void reverseDisplay(String str){

        if(str.length() == 0)
            return;

        System.out.print(str.charAt(str.length()-1));

        reverseDisplay(str.substring(0,str.length()-1));
    }
}

