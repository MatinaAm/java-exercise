package section8;

public class Main {
    public static void main(String[] args) {
        Deposit[] deposits = new Deposit[3];

        deposits[0] = new LongTermDeposit("Dotin", 10000);
        deposits[1] = new ShortTermDeposit("Matina", 5000);
        deposits[2] = new SavingDeposit("charity", 3000);

        for (Deposit deposit : deposits) {
            deposit.calculateMonthlyInterest();
        }



        deposits[0].deposit(1000);
        deposits[0].withdraw(1000);

        deposits[1].deposit(1000);
        deposits[1].withdraw(4000);
        deposits[1].withdraw(1000);

        deposits[2].deposit(500);
        deposits[2].withdraw(4000);
        deposits[2].withdraw(1000);

        // Recalculate interest to see changes
        for (Deposit deposit : deposits) {
            deposit.calculateMonthlyInterest();
        }
    }

    }
