public class ATM {

    double balance;

 
    ATM(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        atm.checkBalance();
        atm.deposit(2000);
        atm.withdraw(3000);
        atm.withdraw(10000);
        atm.checkBalance();
    }
}
