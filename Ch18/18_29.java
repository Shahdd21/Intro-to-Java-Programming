import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo  {
    public static int cnt = 0 ;

    public static void main (String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the directory name : ");
        String name = input.nextLine();

        File file = new File(name);

        getNumFiles(file);

        System.out.println("The number of files in the directory is : "+ cnt);
    }

    public static void getNumFiles(File file){

        File[] files = file.listFiles();

        for(int i = 0 ; i < files.length; ++i) {
            if (files[i].isDirectory())
                getNumFiles(files[i]);

            else
                cnt++;
        }
    }
}

