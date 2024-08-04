import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(23, 25, 7, 14, 85, 65));
        mergeSort(arr);
        System.out.println(arr);
    }

    public static <E extends Comparable<E>> void mergeSort(List<E> list){

        if(list.size() > 1) {
            List<E> firstHalf = list.subList(0, list.size() / 2);
            mergeSort(firstHalf);

            List<E> secondHalf = list.subList(list.size() / 2, list.size());
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    public static  <E extends Comparable<E>> void merge(List<E> firstHalf, List<E> secondHalf, List<E> list){

        int f_index = 0, s_index = 0, listIndex = 0 ;

        while(f_index< firstHalf.size() && s_index < secondHalf.size()){

            if(firstHalf.get(f_index).compareTo(secondHalf.get(s_index)) < 0)
                 list.set(listIndex++, firstHalf.get(f_index++)) ;

            else
                list.set(listIndex++, secondHalf.get(s_index++));
        }

        while(f_index < firstHalf.size())
            list.set(listIndex++, firstHalf.get(f_index++)) ;

        while(s_index < secondHalf.size())
            list.set(listIndex++, secondHalf.get(s_index++));
    }

    public static <E> void mergeSort(List<E> list, Comparator<? super E> c){

        if(list.size() > 1) {
            List<E> firstHalf = list.subList(0, list.size() / 2);
            mergeSort(firstHalf,c);

            List<E> secondHalf = list.subList(list.size() / 2, list.size());
            mergeSort(secondHalf,c);

            merge(firstHalf, secondHalf, list, c);
        }
    }

    public static <E> void merge(List<E> firstHalf, List<E> secondHalf, List<E> list, Comparator<? super E> c) {
        int f_index = 0, s_index = 0, listIndex = 0 ;

        while(f_index< firstHalf.size() && s_index < secondHalf.size()){

            if(c.compare(firstHalf.get(f_index),(secondHalf.get(s_index)) ) < 0)
                list.set(listIndex++, firstHalf.get(f_index++)) ;

            else
                list.set(listIndex++, secondHalf.get(s_index++));
        }

        while(f_index < firstHalf.size())
            list.set(listIndex++, firstHalf.get(f_index++)) ;

        while(s_index < secondHalf.size())
            list.set(listIndex++, secondHalf.get(s_index++));
    }
}
