import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception{

     File file = new File(args[0]);

     Stack<String> stk = new Stack<>();

     try(Scanner reader = new Scanner(file)){

         while(reader.hasNext()) {
             String token = reader.next();

             if(token.equals("(") || token.equals("{") || token.equals("["))
                 stk.push(token);

             else if((token.equals(")") && stk.peek() == "(") || (token.equals("}") && stk.peek() == "{") ||
                     (token.equals("]") && stk.peek() == "["))
                  stk.pop();

             else
                 break;
         }

         if(!stk.empty())
             System.out.println("Incorrect pairs of grouping symbols");

         else
             System.out.println("Correct pairs of grouping symbols");
     }
    }
}
