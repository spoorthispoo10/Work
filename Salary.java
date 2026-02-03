class Salary {

    double calculateSalary(double basic) {
        return basic;
    }

    double calculateSalary(double basic, double bonus) {
        return basic + bonus;
    }

    public static void main(String[] args) {
        Salary s = new Salary();
        System.out.println(s.calculateSalary(30000));
        System.out.println(s.calculateSalary(30000, 5000));
    }
}
