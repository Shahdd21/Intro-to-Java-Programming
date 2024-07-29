import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception{

      LinkedList<Integer> list = new LinkedList<>();

      for(int i = 0 ; i < 5000000 ; ++i)
          list.add(i+1);

      Iterator<Integer> iterator = list.iterator();

        long startTime = System.currentTimeMillis();
        while(iterator.hasNext()){
            iterator.next();
        }
        long endTime = System.currentTimeMillis();

        long elapedTimeIterator= (endTime-startTime) /1000;

        startTime = System.currentTimeMillis();
        for(int i = 0 ; i < list.size(); ++i)
            list.get(i);

        endTime = System.currentTimeMillis();

        long elapedTimeGetI= (endTime-startTime) /1000;

        System.out.println("Time using Iterator is : " + elapedTimeIterator);
        System.out.println("Time using get(index) is : " + elapedTimeGetI);
    }
}
