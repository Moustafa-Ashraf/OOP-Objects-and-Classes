public class Main {

    public static void GetAccountInfo(Account x){
        System.out.println("Account Id: "+ x.getID());
        System.out.println("Date created: "+ x.getDateCreated());
        System.out.println("Balance: "+ x.getBalance());
        System.out.println("Monthly interest rate: "+ x.GetMonthlyInterestRate());


    }

    public static void main(String[] args) {

        Account a0 = new Account(1122,20.000);
        a0.setAnnualInterestRate(4.5);
        a0.Withdraw(2.500);
        a0.Deposit(3.000);
        GetAccountInfo(a0);
    }
}