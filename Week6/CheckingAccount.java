package Week6;

public class CheckingAccount extends BankAccount {
    private double MyInterest;

    public CheckingAccount(double interest)
    {
        super();
        this.MyInterest = interest;
    }

    public String toString()
    {
        return ("Checking Account:" + super.toString() + "Interest Rate = " + this.MyInterest);
    }
}
