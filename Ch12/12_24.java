public class Demo  {
    public static void main (String[] args) throws Exception {

        final int ASSISTANT = 1, ASSOCIATE = 2, FULL = 3;

       try( PrintWriter output = new PrintWriter("Salary.txt"); )
       {
           for(int i = 1 ; i <= 1000; ++i)
           {
               output.printf("FirstName%d LastName%d", i,i);

               int rank = (int)(Math.random()*3) +1;
               if(rank == ASSISTANT)
               {
                   double salary = Math.random()*30000 + 50000;

                   output.printf(" assistant %.2f\n", salary);
               }

               else if( rank == ASSOCIATE)
               {
                   double salary = Math.random()*50000 + 60000;

                   output.printf(" associate %.2f\n", salary);
               }

               else
               {
                   double salary = Math.random()*55000 + 75000;

                   output.printf(" full %.2f\n", salary);
               }
           }
       }
    }
}
