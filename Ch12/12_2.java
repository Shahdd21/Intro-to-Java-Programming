public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        int num=0,num1=0;

        do {
            try {
                System.out.println("Enter two numbers : ");
                num = input.nextInt();
                num1 = input.nextInt();

                flag = false;
            } catch (InputMismatchException ex) {
                System.out.println("Input is invalid. Try again");
                input.nextLine();
            }
        }while (flag);

        int sum = num+num1;
        System.out.print("Sum is : "+ sum);
    }

}
