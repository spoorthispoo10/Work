class ElectronicDevice {
    String brand;

    void powerOn() {
        System.out.println("Device powered on.");
    }
}

class Laptop extends ElectronicDevice {
    int ramSize;

    Laptop(String brand, int ramSize) {
        this.brand = brand;
        this.ramSize = ramSize;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ramSize + "GB");
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("Dell", 16);
        l.powerOn();
        l.display();
    }
}
