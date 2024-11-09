class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class SavingAccount {
    private int acNo;
    private String name;
    private double balance;
    private static final double MINIMUM_BALANCE = 500.0;

    public SavingAccount(int acNo, String name, double initialBalance) {
        this.acNo = acNo;
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < MINIMUM_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds! Minimum balance of 500 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }

    public void viewBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class p8 {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(101, "Partha", 1000);

        account.viewBalance();
        account.deposit(200);

        try {
            account.withdraw(800);
            account.withdraw(200);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
