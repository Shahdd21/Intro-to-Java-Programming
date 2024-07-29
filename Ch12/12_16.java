public class Demo  {
    public static void main (String[] args) throws Exception{

        if(args.length !=  3)
        {
            System.out.println("The input is not correct");
            System.exit(1);
        }

        File file = new File(args[0]) ;

        if(!file.exists())
        {
            System.out.printf("Source file : %s doesn't exist.", file) ;
            System.exit(1);
        }

        StringBuilder str = new StringBuilder();

        try( Scanner input = new Scanner(file) )
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                System.out.println("Original line: " + line);

                str.append(line.replace(args[1],args[2]) + "\r\n") ;
                System.out.println("The appended string is : " + str);
            }
        }

        try (PrintWriter output = new PrintWriter(file))
        {
            output.printf("%s\r\n", str.toString());
        }
    }
}
