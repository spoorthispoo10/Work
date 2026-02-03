public class Employee {

    String name;
    double basicSalary;


    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateGrossSalary() {

        double hra = 0.20 * basicSalary; 
        double da = 0.10 * basicSalary;   

        return basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Spoorthi", 30000);

        emp1.displayDetails();
    }
}
