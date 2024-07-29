public class Demo  {
    public static void main (String[] args) throws Exception {

      System.out.print("Enter the file name : ");
      Scanner input = new Scanner(System.in);
      String name = input.next();

      File file = new File(name);

      int[] freq = new int[200];

      try(Scanner in = new Scanner(file);)
      {
          while(in.hasNext())
          {
              String line = in.nextLine().toUpperCase();

              for(int i = 0 ; i < line.length(); ++i) {
                  freq[(int)line.charAt(i)]++;
              }
          }
      }

      int start = 65;
      for(int i = 0 ; i < 26 ; ++i)
      {
          System.out.printf("Number of %c : %d\n", (char)start, freq[start]);
          start++;
      }
    }
}
