import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) {

        Integer[] list = {9,5,1,0,2,3,7};
        bubbleSort(list);

        for(int i = 0 ;i < list.length; ++i)
            System.out.print(list[i]+" ");
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list){

        boolean nextPass = true;
        for(int i = 1 ; i < list.length && nextPass ; ++i){

            nextPass = false;

            for(int j = 0; j < list.length-i ; ++j){

                if(list[j].compareTo(list[j+1]) > 0){
                    E temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    nextPass = true;
                }
            }
        }
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> c){
        boolean nextPass = true;
        for(int i = 1 ; i < list.length && nextPass ; ++i){

            nextPass = false;

            for(int j = 0; j < list.length-i ; ++j){

                if(c.compare(list[j],list[j+1]) > 0){
                    E temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    nextPass = true;
                }
            }
        }
    }
}
