public class Battery {

    private int batteryLevel = 50;

    public void charge(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) batteryLevel = 100;
    }

    public void use(int amount) {
        batteryLevel -= amount;
        if (batteryLevel < 0) batteryLevel = 0;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public static void main(String[] args) {
        Battery m = new Battery();
        m.charge(60);
        m.use(30);
        System.out.println("Battery: " + m.getBatteryLevel());
    }
}
