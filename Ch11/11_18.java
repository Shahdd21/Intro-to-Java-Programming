public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Character> list = new ArrayList<>() ;

        ArrayList<Character> result =  toCharacterArray("shahd");

        for(int i = 0; i < result.size(); ++i)
            System.out.print(result.get(i)+" ");
    }

    public static ArrayList<Character> toCharacterArray(String s)
    {
       char[] chars = s.toCharArray();

       ArrayList<Character> list = new ArrayList<>();

       for(int i = 0 ; i < chars.length; ++i)
           list.add(chars[i]);

       return list;
    }
}
