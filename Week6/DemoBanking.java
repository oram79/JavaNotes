package Week6;

public class DemoBanking {
    public static void main(String[] args) {
        BankAccount Ba1 = new BankAccount(1000);
        System.out.println(Ba1);
        Ba1.deposit(100);
        System.out.println(Ba1);
        Ba1.withdraw(10000);
        System.out.println(Ba1);
     
       System.out.println();
       CheckingAccount Ca1 = new CheckingAccount(0.4);
       System.out.println(Ca1);
       Ca1.deposit(1000);
       System.out.println(Ca1);
       Ca1.withdraw(50);
       System.out.println(Ca1);
       System.out.println();
       System.out.println("Checking account 2");
       CheckingAccount Ca2 = new CheckingAccount(1000, 0.4);
       System.out.println(Ca2);
       System.out.println();
       System.out.println("Transaction Fee Checking account 2");

       TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount(100, 0.3);
       System.out.println(TFCA);
       TFCA.chargeFee();
       System.out.println(TFCA);
       TFCA.deposit(100);
       System.out.println(TFCA);
       TFCA.withdraw(50);
       System.out.println(TFCA);

    }
}

