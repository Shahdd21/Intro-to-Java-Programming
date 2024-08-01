import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws IOException{

        String fileName = args[0];

        File file = new File(fileName);

        Map<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);

        countVowels(map,file);

        System.out.print(map);
    }

    public static void countVowels(Map<Character,Integer> map, File file) throws IOException {

        try(Scanner reader = new Scanner(file)){

            while(reader.hasNext()){

                String word = reader.next();

                for(int i = 0 ; i< word.length() ; ++i){

                    Character c = Character.toLowerCase(word.charAt(i));

                    if(map.containsKey(c)){

                        int value = map.get(c);
                        ++value;
                        map.put(c,value);
                    }
                }
            }
        }
    }
}
