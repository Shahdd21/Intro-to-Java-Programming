public class Demo  {
    public static void main (String[] args) throws Exception{

        if(args.length != 1)
        {
            System.out.println("Wrong output");
            System.exit(1);
        }

        File src = new File(args[0]);

        if(!src.exists())
        {
            System.out.println("The directory doesn't exist");
            System.exit(2);
        }

        if(!src.isDirectory())
        {
            System.out.println(src +" is not a directory");
            System.exit(3);
        }

        File[] files = src.listFiles();

        for(int i = 0 ; i < files.length ; ++i)
        {
            if(files[i].isDirectory() && files[i].getName().startsWith("Chapter"))
            {
                System.out.println("First Directory");
                String statement = "package "+ files[i].getName() + ";\r\n";
                insertIntoFilesInDirectory(files[i], statement);
            }
        }
    }

    public static void insertIntoFilesInDirectory(File directory, String statement) throws Exception {
        File[] files = directory.listFiles();

        System.out.println("Second Directory");

        for(int i = 0 ; i < files.length; ++i)
        {
            if(files[i].isFile() && files[i].getName().endsWith(".txt"))
            {
                insertPackageStatement(files[i], statement);
            }
        }
    }

    public static void insertPackageStatement(File file, String statement) throws Exception{

        StringBuilder str = new StringBuilder(statement);

        System.out.println("Inside file");

        try(Scanner input = new Scanner(file))
        {
            while(input.hasNext())
            {
                str.append("\r\n" + input.nextLine());
            }
        }

        try(PrintWriter output = new PrintWriter(file))
        {
            output.print(str.toString() + "\r\n");
        }
    }
}
