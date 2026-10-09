package lab1ajd;

public class Bank {

    private double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;

            System.out.println("Withdrawal successful");
            System.out.printf("Remaining balance: %.2f%n", amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;

        System.out.printf("Updated balance: %.2f%n", amount);
    }

    public static void main(String[] args) {

        Bank bank = new Bank(10000.00);

        System.out.println("Initial balance: " + String.format("%.2f", bank.amount));

        System.out.println("\nWithdrawal of 5000.00:");
        bank.withdraw(5000.00);

        System.out.println("\nDeposit of 5000.00:");
        bank.deposit(5000.00);
    }
}
