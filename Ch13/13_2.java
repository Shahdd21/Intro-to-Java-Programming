public class Demo  {
    public static void main (String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        print(list);
        shuffle(list);
        print(list);
    }

    public static void shuffle(ArrayList<Integer> list)
    {
        for(int i =0; i < list.size(); ++i)
        {
            int idx = (int)(Math.random()* list.size());
            int temp = list.get(i);

            list.set(i,list.get(idx));
            list.set(idx,temp);
        }
    }

    public static void print(ArrayList<Integer> list)
    {
        for(int i = 0 ; i < list.size(); ++i)
           System.out.print(list.get(i) + " ");

        System.out.println();
    }
}
