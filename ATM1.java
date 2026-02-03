public class ATM1 {

    private double balance = 5000;
    private int pin = 1234;

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void withdraw(int enteredPin, double amount) {
        if (validatePin(enteredPin)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    public static void main(String[] args) {
        ATM1 atm = new ATM1();
        atm.withdraw(1234, 1000);
        atm.withdraw(1111, 500);
    }
}
