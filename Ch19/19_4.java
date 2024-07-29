import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7};

        System.out.print("Is number 8 in the list ?");

        int res = linearSearch(arr,8);
        if( res > 0){
         System.out.println(" Yes. At index " + res);
        }

        else{
            System.out.println(" No");
        }

        System.out.print("Is number 7 in the list ?");

        res = linearSearch(arr,7);
        if( res > 0){
            System.out.println(" Yes. At index " + res);
        }

        else{
            System.out.println(" No");
        }
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){

        for(int i = 0 ; i < list.length; ++i){
            if(list[i].compareTo(key) == 0)
                return i ;
        }

        return -1;
    }
}
