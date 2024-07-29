import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(8);

        System.out.println("The original list is :");
        for(int i = 0 ; i < list.size(); ++i)
            System.out.print(list.get(i) + " ");
        System.out.println();

        ArrayList<Integer> noDups = removeDuplicates(list);

        System.out.println("The new list is :");
        for(int i = 0 ; i < noDups.size(); ++i)
            System.out.print(noDups.get(i) + " ");
        System.out.println();
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){

        ArrayList<E> newList = new ArrayList<>();

        for(int i = 0 ; i < list.size(); ++i){

            if(!newList.contains(list.get(i)))
                newList.add(list.get(i));
        }

        return newList;
    }
}
