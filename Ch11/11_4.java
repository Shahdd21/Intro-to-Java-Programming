import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int temp;
        do{
            temp = input.nextInt();

            if(temp !=0)
              list.add(temp);

        }while(temp != 0);

        int mx = max(list);

        System.out.print(mx);
    }

    public static Integer max(ArrayList<Integer> list)
    {
        if(list == null || list.isEmpty())
            return null;

        int res = list.get(0);

        for(int i = 1 ; i < list.size() ; ++i)
        {
            if(res < list.get(i))
                res = list.get(i);
        }

        return res;
    }
}
