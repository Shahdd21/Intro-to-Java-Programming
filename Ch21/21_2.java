import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws IOException{

        String fileName = args[0];

        File file = new File(fileName);

       SortedSet<String> set = addWords(file) ;

       displaySet(set);
    }

    public static SortedSet<String> addWords(File file) throws IOException{

        SortedSet<String> set = new TreeSet<>();

        try(Scanner reader = new Scanner(file)){

            while(reader.hasNext()){
                set.add(reader.next());
            }
        }
        return set;
    }

    public static void displaySet(SortedSet<String> set){

        for(String element : set)
            System.out.println(element);
    }
}
