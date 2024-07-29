public class Demo  {
    public static void main (String[] args) throws Exception {

        System.out.print("Enter directory name");
        Scanner input = new Scanner(System.in);
        String dirName = input.next();

        File file = new File(dirName);

        boolean isCreated = file.mkdirs();

        if(isCreated)
            System.out.println("The directory is created successfully");

        else
            System.out.println("The directory already exists");
    }
}
