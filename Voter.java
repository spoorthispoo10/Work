public class Voter {

    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public boolean isEligible() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Voter v = new Voter();
        v.setAge(20);
        System.out.println("Eligible to vote: " + v.isEligible());
    }
}
