import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception{

        String str = args[0] ;

        Stack<Character> stk = new Stack<>();
        String res = "";

        for(int i = 0 ; i < str.length() ; ++i)
        {
            if(Character.isDigit(str.charAt(i)))
                res += str.charAt(i)+ " ";

            else if(str.charAt(i) == '+' || str.charAt(i) == '*' || str.charAt(i) == '-' || str.charAt(i) == '/')
                stk.push(str.charAt(i));
        }

        while(!stk.empty()){

            res += stk.pop() +" " ;
        }

        System.out.print(res);
    }
}
