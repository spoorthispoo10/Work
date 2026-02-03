class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student2 extends Person {
    int rollNumber;
    int marks;

    Student2(String name, int age, int rollNumber, int marks) {
        super(name, age);  
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student2 s = new Student2("Spoorthi", 20, 101, 90);
        s.display();
    }
}

