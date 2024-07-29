public class Demo  {
    public static void main (String[] args) throws Exception {

        String[] inputs = args[0].split(" ");

        String number1 = inputs[0];
        String numerator1 = number1.substring(0, number1.indexOf("/"));
        String denominator1 = number1.substring(number1.indexOf("/")+1);

        String number2 = inputs[2];
        String numerator2 = number2.substring(0, number2.indexOf("/"));
        String denominator2 = number2.substring(number2.indexOf("/")+1);

        if(inputs[1].charAt(0) == '+'){
            System.out.print(number1 + inputs[1] + number2);

            int top = Integer.parseInt(numerator1)* Integer.parseInt(denominator2) +
                    Integer.parseInt(denominator1) * Integer.parseInt(numerator2);

            int bottom = Integer.parseInt(denominator1) * Integer.parseInt(denominator2);

            System.out.printf(" = %d/%d\n", top,bottom);
        }

    }
}
