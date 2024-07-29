import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception{

        File file = new File(args[0]);

        try(Scanner input = new Scanner(file)){

            ArrayList<String> list = new ArrayList<>();

            while(input.hasNext()){
                list.add(input.next());
            }

            Collections.sort(list);

            for(int i = 0 ; i < list.size() ; ++i)
                System.out.print(list.get(i) +" ");
        }
    }
}
