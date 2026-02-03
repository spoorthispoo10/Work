class Payment {
    void processPayment() {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment {
    void processPayment() {
        System.out.println("Processing UPI payment");
    }
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Processing Credit Card payment");
    }

    public static void main(String[] args) {
        Payment[] payments = { new UPI(), new CreditCard() };

        for (Payment p : payments) {
            p.processPayment();
        }
    }
}
