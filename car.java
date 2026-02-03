public class car{
    String brand;
    String model;
    double price;

    car(String brand,String model,double price){
        this.brand = brand;
        this.model=model;
        this.price=price;
    }
    void displayDetails(){
        System.out.println("Brand:"+ brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

public static void main(String[]args){
    car car1 = new car("Toyota", "Innova", 2000000);
    car1.displayDetails();
}
}
