public class Student1 {

    private String name;
    private int marks;

    public Student(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student s = new Student("Spoorthi");
        s.setMarks(85);
        s.setMarks(150); 
        System.out.println("Marks: " + s.getMarks());
    }
}
