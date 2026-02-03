class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car2 extends Vehicle {
    String fuelType;

    Car2(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {
        Car2 c = new Car2("Toyota", 120, "Petrol");
        c.display();
    }
}
