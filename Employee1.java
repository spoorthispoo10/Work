public class Employee1 {

    private double salary;

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.setSalary(50000);
        e.setSalary(-2000); // invalid
        System.out.println("Salary: " + e.getSalary());
    }
}
