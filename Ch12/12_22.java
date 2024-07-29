public class Demo {

    public static void main(String[] args) throws Exception{

        if(args == null || args.length != 3)
        {
            System.out.println("Wrong input");
            System.exit(1);
        }

        File dir = new File(args[0]);

        if(!dir.exists())
        {
            System.out.println("The directory doesn't exist");
            System.exit(2);
        }

        if(!dir.isDirectory())
        {
            System.out.println(dir +" is not a directory");
            System.exit(3);
        }

        File[] files = dir.listFiles();

        for(int i = 0 ; i < files.length ; ++i)
        {
            System.out.printf("File %d\n", i+1);

            StringBuilder str = new StringBuilder();
            try(Scanner input = new Scanner(files[i]))
            {
                while(input.hasNext()){

                    String line = input.nextLine();
                    str.append(line.replaceAll(args[1],args[2])+"\r\n");
                }
            }

            try(PrintWriter output = new PrintWriter(files[i]))
            {
                output.print(str.toString());
            }
        }
    }
}
