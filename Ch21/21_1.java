import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception {

        Set<String> set1 = new LinkedHashSet<>(Arrays.asList("George","Jim","John","Blake","Kevin","Michael"));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList("George","Ryan","Katie","Kevin","Michelle"));

        System.out.println("Union of the two sets is : " + union(set1,set2));
        System.out.println("Difference of the two sets is : " + difference(set1,set2));
        System.out.println("Intersection of the two sets is : " + intersection(set1,set2));
    }

    public static Set<String> union(Set<String> set1, Set<String> set2){

        Set<String> temp = new LinkedHashSet<>(set1);
        temp.addAll(set2);

        return temp;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2){

        Set<String> temp = new LinkedHashSet<>(set1);
        temp.removeAll(set2);

        return temp;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2){

        Set<String> temp = new LinkedHashSet<>(set1);
        temp.retainAll(set2);

        return temp;
    }
}
