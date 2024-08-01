import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();

        Scanner input = new Scanner(System.in);
        int in ;
        do{

            in = input.nextInt();
            if(in == 0 )
                break;

            if(map.containsKey(in)){
                int value = map.get(in);
                ++value;
                map.put(in,value);
            }
            else{
                map.put(in,1);
            }

        }while(in != 0);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(new MapValueComparator());

        Map<Integer,Integer> sortedMap = new LinkedHashMap<>();

       for(Map.Entry<Integer,Integer> entry : list){
           sortedMap.put(entry.getKey(), entry.getValue());
       }

       int mx = Collections.max(sortedMap.values());

       sortedMap.forEach(
               (key,value) -> {
                   if(value == mx)
                       System.out.println(key);
               }
       );
    }
}

class MapValueComparator implements Comparator<Map.Entry<Integer,Integer>> , Serializable {

    public int compare(Map.Entry<Integer,Integer> map1, Map.Entry<Integer,Integer> map2){

        if(map2.getValue() > map1.getValue())
            return 1;

        else if (map1.getValue().equals(map2.getValue()))
            return 0;
        else
            return -1;
    }
}
