public class Demo  {
    public static void main (String[] args) throws Exception {

        try(FileOutputStream output = new FileOutputStream("Ex17.dat",true);) {

            for(int i = 1; i <= 100; ++i)
                output.write((int)(Math.random()*100));
        }

        try(FileInputStream input = new FileInputStream("Ex17.dat");) {

            for(int i = 1; i <= 100; ++i)
                System.out.print(input.read() +" ");
        }
    }
}
