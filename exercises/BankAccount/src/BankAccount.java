public class BankAccount {

    private int accountNum;
    private double balance;
    private String clientName;
    private String clientEmail;
    private String clientPhone;

    public BankAccount() {
        this(9384, 1000, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNum, double balance, String clientName, String clientEmail, String clientPhone) {
        System.out.println("Account Constructor With Parameters");
        this.accountNum = accountNum;
        this.balance = balance;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }
    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }
    public int getAccountNum() {
        return this.accountNum;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getClientName() {
        return this.clientName;
    }
    public String getClientEmail() {
        return this.clientEmail;
    }
    public String getClientPhone() {
        return this.clientPhone;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit Successful.");
        System.out.println("New Balance: " + this.balance);
    }
    public void withdraw(double amount) {
        if((this.balance - amount) >= 0) {
            this.balance -= amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("New Balance: " + this.balance);
        }
        else {
            System.out.println("Withdrawal Failed.");
            System.out.println("Insufficient Funds");
        }
    }
}
