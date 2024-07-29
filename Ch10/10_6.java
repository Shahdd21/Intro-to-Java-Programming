public class Demo {
    public static void main(String[] args)
    {
        StackOfIntegers stk = new StackOfIntegers();

        for(int i = 2; i < 120 ; ++i)
        {
            boolean isPrime = true;
            for(int j = 2 ; j < i ; ++j)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                stk.push(i);
        }

        while(!stk.empty()) {
            System.out.print(stk.top() + " ");
            stk.pop();
        }
    }
}
