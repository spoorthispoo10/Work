public class Product {

    private double price;
    private int stock;

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(500);
        p.setStock(10);
        p.setStock(-5); 
    }
}

