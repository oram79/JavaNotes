package Week6;

public class TransactionFeeCheckingAccount extends CheckingAccount {
    private static final double FEE = 2.00;
   public TransactionFeeCheckingAccount(double interest) {
    super(interest);
    }
    public TransactionFeeCheckingAccount(double amount, double interest) {
       super(amount, interest);
       }
   //Can add methods of your choice
     public void chargeFee() {
       withdraw(FEE);
     }
     public String toString()
     {
       return (super.toString() + " Transaction Feee = " + FEE);
     }

   }
