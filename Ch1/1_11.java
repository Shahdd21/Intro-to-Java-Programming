public class Demo
{
    public static void main(String[] args)
    {
        /*
          current population = 312,032,486
          1 birth = 7 seconds
          1 death = 13 seconds
          1 immigration = 45 seconds
          year = 365 days

          population of each year for 5 years ??
         */

        /* 1 day = 24 hrs = 1440 mins = 86400 secs

         45 seconds -> 7(b) 13(d) 14(b) 21(b) 26(d) 28(b) 35(b) 39(d) 42(b) 45(immigration)

         every 45 seconds :
         +7
         -3
         = 4 total additions

         86400 / 45 = 1920 cycles in a day
         */

        int daily_pp = 1920 * 4 ;
        int yearly_pp = daily_pp * 365 ;

        long curr_pp = 312032486;

        for(int i = 0 ; i < 5 ; ++i)
        {
            curr_pp += yearly_pp;

            System.out.println(curr_pp);
        }

    }
}
