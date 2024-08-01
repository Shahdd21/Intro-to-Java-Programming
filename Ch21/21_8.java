import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws IOException{

        String fileName = args[0];

        File file = new File(fileName);

        Map<String,Integer> map = new TreeMap<>();

        try(Scanner reader = new Scanner(file)){

            while(reader.hasNext()) {
                String line = reader.nextLine();
                String[] words = line.split("[\\s\\p{P}\"'\\(\\)]");

                for (int i = 0; i < words.length; ++i) {

                    if (!Character.isLetter(words[i].charAt(0)))
                        continue;

                    if (!map.containsKey(words[i])) {
                        map.put(words[i], 1);
                    } else {
                        int value = map.get(words[i]);
                        ++value;
                        map.put((words[i]), value);
                    }
                }
            }


        }

        map.forEach(
                (key,value) -> {
                    System.out.println(value +" "+ key);
                }
        );
    }
}
