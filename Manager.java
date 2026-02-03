class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void code() {
        System.out.println(name + " is coding.");
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}
