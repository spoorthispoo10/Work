class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with button");
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike() };

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
