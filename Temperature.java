public class Temperature {

    private double celsius;

    public void setCelsius(double value) {
        if (value >= -273.15) {
            this.celsius = value;
        } else {
            System.out.println("Temperature cannot be below absolute zero.");
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(25);
        t.setCelsius(-300); 
        System.out.println("Temperature: " + t.getCelsius());
    }
}
