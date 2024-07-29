import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo  {
    public static int cnt = 0 ;

    public static void main (String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string and a charcter : ");
        String s = input.next();
        char a = input.next().charAt(0);

        System.out.printf("The number of occurrences of %s is %d", a, count(s,a)) ;
    }

    public static int count(String s, char a){
        return count(s,a,0);
    }

    public static int count(String s, char a, int cnt){

        if(s.length() == 0)
            return cnt;

        if(s.charAt(s.length()-1) == a)
            cnt++;

        return count(s.substring(0,s.length()-1),a,cnt);
    }
}

