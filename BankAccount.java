public class BankAccount {

   
    private double balance;

   
   
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

   
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        acc.deposit(2000);
        acc.deposit(-100);      

        acc.withdraw(3000);
        acc.withdraw(10000);   

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
