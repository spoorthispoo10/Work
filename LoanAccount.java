class Account {
    int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class LoanAccount extends Account {
    double loanAmount;

    LoanAccount(int accNo, double loanAmount) {
        super(accNo);
        this.loanAmount = loanAmount;
    }

    void calculateEMI() {
        double emi = loanAmount / 12;
        System.out.println("Monthly EMI: " + emi);
    }
}
