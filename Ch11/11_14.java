public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>() ;
        ArrayList<Integer> list2 = new ArrayList<>() ;

        for(int i = 0; i < 5; ++i)
            list1.add(input.nextInt());

        for(int i = 0; i < 5; ++i)
            list2.add(input.nextInt());

        ArrayList<Integer> result = union(list1,list2);

        for(int i = 0 ; i < result.size(); ++i)
            System.out.print(result.get(i)+" ");
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i < list1.size(); ++i)
             temp.add(list1.get(i));

        for(int i = 0; i < list2.size(); ++i)
             temp.add(list2.get(i));

        return temp;
    }
}
