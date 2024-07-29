public class Demo {
    public static void main(String[] args)
    {
        Account acc = new Account(1122,1000);
        acc.setAnnualInterestRate(1.5);
        acc.setName("George");

        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);

        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);

        System.out.println("Name : "+acc.getName());
        System.out.println("Current Balance : "+acc.getBalance());
        System.out.println("Interest Rate : "+acc.getMonthlyInterest());
        System.out.println("All transactions on the account are : ");
        acc.getAllTransactions();
    }
}

class Account{
    private int id ;
    private String name;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated ;
    private ArrayList<Transactions> transactions = new ArrayList<>();

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate =0;
        dateCreated = new Date() ;
    }

    public Account(int id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getID()
    {
        return id ;
    }
    public void setID(int id) { this.id = id ;}

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

    public Date getDate()
    {
        return dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12 ;
    }

    public double getMonthlyInterest()
    {
        return balance * (getMonthlyInterestRate()/100);
    }

    public void withdraw(double value)
    {
        balance -= value;
        transactions.add(new Transactions('W',value,balance,"Withdrawal")) ;
    }

    public void deposit(double value)
    {
        balance += value;
        transactions.add(new Transactions('D',value,balance,"Deposite")) ;
    }

    public void getAllTransactions()
    {
        for(int i = 0 ;i < transactions.size() ; ++i)
        {
            Transactions t = transactions.get(i);
            System.out.println(t.getType()+" , "+t.getAmount()+" , "+t.getBalance()+" , "+t.getDescription()+" , "+t.getDate());
        }
    }
}

class Transactions{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transactions()
    {
        date = new Date();
    }

    public Transactions(char type, double amount, double balance, String description)
    {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public char getType()
    {
        return type;
    }

    public double getAmount()
    {
        return amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getDescription()
    {
        return description;
    }

    public Date getDate()
    {
        return date;
    }
}
