package section8;

    public class LongTermDeposit extends Deposit {
        private static final double ANNUAL_INTEREST_RATE = 0.20;

        public LongTermDeposit(String ownerName, double balance) {
            super(ownerName, balance);
        }

        @Override
        public void deposit(double amount) {
            System.out.println("Deposits are not allowed for long term deposits.");
        }

        @Override
        public void withdraw(double amount) {
            System.out.println("Withdrawals are not allowed for long term deposits.");
        }

        @Override
        public void calculateMonthlyInterest(){
            double monthlyInterest = balance * ANNUAL_INTEREST_RATE / 12;
            balance += monthlyInterest;
            System.out.println("Long-term deposit monthly interest calculated. New balance: " + balance);
        }

    }
