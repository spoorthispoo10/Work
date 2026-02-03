public class Mobile {

    String brand;
    int batteryPercentage;

   
    Mobile(String brand, int batteryPercentage) {
        this.brand = brand;
        this.batteryPercentage = batteryPercentage;
    }

    void charge(int percent) {
        batteryPercentage += percent;

        if (batteryPercentage > 100) {
            batteryPercentage = 100;
        }

        System.out.println("Battery after charging: " + batteryPercentage + "%");
    }

    void useBattery(int percent) {
        batteryPercentage -= percent;

        if (batteryPercentage < 0) {
            batteryPercentage = 0;
        }

        System.out.println("Battery after usage: " + batteryPercentage + "%");
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", 50);

        m1.charge(40);
        m1.useBattery(30);
        m1.useBattery(80);
    }
}
