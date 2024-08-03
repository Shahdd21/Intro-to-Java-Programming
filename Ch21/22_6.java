import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) throws Exception {

        System.out.println("\t\t40\t41\t42\t43\t44\t45");

        long[] fibs = new long[6];

        long n = 40;
        for(int i = 0 ; i < fibs.length ; ++i){
            fibs[i] = fib(n);
            ++n;
        }

        System.out.print("GCD\t");
        long startTime = System.currentTimeMillis();
        for(int i = 0 ; i < 5 ; ++i){

            long gcd = GCD(fibs[i],fibs[i+1]);
            System.out.print("\t"+gcd);
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        long elapsedTimeGCD = (endTime-startTime)/1000;

        System.out.print("Euclid");
        startTime = System.currentTimeMillis();
        for(int i = 0 ; i < 5 ; ++i){

            long gcd = euclidGCD(fibs[i],fibs[i+1]);
            System.out.print("\t"+gcd);
        }
        System.out.println();
        endTime = System.currentTimeMillis();
        long elapsedTimeGCDEuclid = (endTime-startTime)/1000;

        System.out.printf("The time taken used GCD is %d seconds\n", elapsedTimeGCD);
        System.out.printf("The time taken used GCDEuclid is %d seconds\n", elapsedTimeGCDEuclid);
    }

    public static long fib(long n){

        int fb0 = 0, fb1 = 1, fb2 = 1;

        if(n ==0)
            return fb0;
        if(n==1 || n==2)
            return fb1;

        for(int i = 3; i <= n ; ++i){

            fb0 = fb1;
            fb1 = fb2;
            fb2 = fb0+fb1;
        }
        return fb2;
    }

    public static long GCD(long m, long n){

        if(m % n == 0)
            return n;

        long mn = Math.min(m,n);
        long gcd = 1;

        for(long i = mn/2 ; i >= 1 ; --i){
            if(m % i == 0 && n % i == 0)
            {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static long euclidGCD(long m, long n){

        if(m % n == 0) return n;

        return euclidGCD(n, m % n);
    }
}
