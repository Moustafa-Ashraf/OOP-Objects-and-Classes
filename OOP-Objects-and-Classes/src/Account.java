import java.time.LocalDate;

public class Account {
    private int ID;
    private double Balance = 0;
    private double AnnualInterestRate = 0;
    private LocalDate DateCreated;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return DateCreated;
    }
//________________________________________________________________________________________________________________
    public Account() {
        this.DateCreated = java.time.LocalDate.now();
    }

    public Account(int ID, double balance) {
        this.ID = ID;
        this.Balance = balance;
        this.DateCreated = java.time.LocalDate.now();
    }

//________________________________________________________________________________________________________________
    public double GetMonthlyInterestRate(){
        double monthly = getAnnualInterestRate()/100*12.0;
        return getBalance()*monthly;
    }
    public void Withdraw(double amount){
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
            System.out.println("Withdraw Operation Succeed!");
        }
        else{
            System.out.println("Withdraw Error, there is no enough money in the account!");
        }

    }

    public void Deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Deposit Operation Succeed!");
    }

}
