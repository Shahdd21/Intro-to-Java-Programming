import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception{

        PriorityQueue<String> p1 = new PriorityQueue<>(Arrays.asList("George","Jim","John","Blake","Kevin","Michael"));
        PriorityQueue<String> p2 = new PriorityQueue<>(Arrays.asList("George","Katie","Ryan","Kevin","Michelle")) ;

        System.out.println("Lists P1 and P2 respectively : ");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Their union : ");
        System.out.println(union(p1,p2));

        System.out.println("Their intersection : ");
        System.out.println(intersection(p1,p2));

        System.out.println("Their difference : ");
        System.out.println(difference(p1,p2));
    }

    public static <T> PriorityQueue<T> union(PriorityQueue<T> list1, PriorityQueue<T> list2){

        PriorityQueue<T> result = new PriorityQueue<T>(list1);
        result.addAll(list2);

        return result;
    }

    public static <T> PriorityQueue<T> difference(PriorityQueue<T> list1, PriorityQueue<T> list2){

        PriorityQueue<T> result = new PriorityQueue<T>(list1);
        result.removeAll(list2) ;

        return result;
    }

    public static <T> PriorityQueue<T> intersection(PriorityQueue<T> list1, PriorityQueue<T> list2){

        PriorityQueue<T> result = new PriorityQueue<T>(list1);
        result.retainAll(list2) ;

        return result;
    }
}
