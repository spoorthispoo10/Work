public class College {

    String collegeName;
    String location;


    College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    void displayDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        College c1 = new College("IIT Delhi", "Delhi");
        College c2 = new College("NIT Surathkal", "Karnataka");
        College c3 = new College("VTU", "Belagavi");

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
