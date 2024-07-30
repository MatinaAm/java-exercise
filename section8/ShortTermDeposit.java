package section8;

public class ShortTermDeposit extends Deposit {
    private static final double ANNUAL_INTEREST_RATE = 0.10;

    public ShortTermDeposit(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);

    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 2000) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Balance cannot be less than " + 2000);
        }
    }

    @Override
    public void calculateMonthlyInterest() {
        double monthlyInterest = (balance * ANNUAL_INTEREST_RATE) / 12;
        balance += monthlyInterest;
        System.out.println("Short-term deposit monthly interest calculated. New balance: " + balance);
    }

}
