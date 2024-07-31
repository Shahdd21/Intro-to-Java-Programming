import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception{

        String str = args[0] ;

        Stack<Integer> stk = new Stack<>();

        int res = 0 ;
        for(int i = 0 ; i < str.length(); ++i){

            if(Character.isDigit(str.charAt(i))){
             stk.push(Integer.parseInt(str.charAt(i)+"")) ;
            }

            else if (str.charAt(i) == '+'){

                res = stk.pop();
                res += stk.pop();

                stk.push(res);
            }

            else if (str.charAt(i) == '-'){

                res = stk.pop();
                res = stk.pop() - res;

                stk.push(res);
            }

            else if (str.charAt(i) == '/'){

                res = stk.pop();
                res /= stk.pop();

                stk.push(res);
            }

            else if (str.charAt(i) == '*'){

                res = stk.pop();
                res *= stk.pop();

                stk.push(res);
            }
        }

        System.out.print(res);
    }
}
