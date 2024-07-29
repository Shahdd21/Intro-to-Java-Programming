ublic class Demo
{
    public static void main(String[] args)
    {
        int x = 3;

        double res = 1.0;

        for(int i = 1 ; i <= 5 ; ++i)
        {
            if( i % 2 == 1)
                res -= (1.0/x);

            else
                res += (1.0/x);

            x += 2;
        }

        System.out.println(4*res);
    }
}
