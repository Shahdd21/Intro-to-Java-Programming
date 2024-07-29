import java.util.* ;
import java.io.* ;

public class Demo  {
    public static void main (String[] args) throws Exception {

        Loan obj1 = new Loan(2.5,5,11000);
        Loan obj2 = new Loan(1.5,5,11000);
        Loan obj3 = new Loan(3,5,11000);
        Loan obj4 = new Loan(2,5,11000);
        Loan obj5 = new Loan(3.5,5,11000);

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Objects.dat"));

        output.writeObject(obj1);
        output.writeObject(obj2);
        output.writeObject(obj3);
        output.writeObject(obj4);
        output.writeObject(obj5);
    }
}

class Loan implements Serializable {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /**
     * Default constructor
     */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /**
     * Instantiates a new Loan.
     *
     * @param annualInterestRate the annual interest rate
     * @param numberOfYears      the number of years
     * @param loanAmount         the loan amount
     */
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /**
     * Return annualInterestRate
     *
     * @return the annual interest rate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Set a new annualInterestRate
     *
     * @param annualInterestRate the annual interest rate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
