class Employees {
    void calculateBonus() {
        System.out.println("Employee bonus");
    }
}

class Developer extends Employees {
    void calculateBonus() {
        System.out.println("Developer bonus: 10%");
    }
}

class Manager extends Employeess {
    void calculateBonus() {
        System.out.println("Manager bonus: 20%");
    }

    public static void main(String[] args) {
        Employees e1 = new Developer();
        Employees e2 = new Manager();

        e1.calculateBonus();
        e2.calculateBonus();
    }
}
