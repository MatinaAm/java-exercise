package section8;

public class SavingDeposit  extends Deposit {

        private static final double ANNUAL_INTEREST_RATE = 0;

        public SavingDeposit(String ownerName, double balance) {
            super(ownerName, balance);
        }

        @Override
        public void deposit(double amount) {
           balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);

        }

        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Withdrawal denied. Insufficient balance.");
            }
        }

        @Override
        public void calculateMonthlyInterest(){
            System.out.println("Saving deposit has no interest. Balance remains: " + balance);

        }


}
