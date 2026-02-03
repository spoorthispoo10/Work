class Appliance {
    int powerRating;

    Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    void turnOn() {
        System.out.println("Appliance turned on.");
    }
}

class WashingMachine extends Appliance {

    WashingMachine(int powerRating) {
        super(powerRating);
    }

    void washClothes() {
        System.out.println("Washing clothes...");
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(1500);
        wm.turnOn();
        wm.washClothes();
    }
}
