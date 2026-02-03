class Shape {
    String color;
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle1 extends Shape {
    double length = 4, width = 6;

    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle1 r = new Rectangle1();
        c.calculateArea();
        r.calculateArea();
    }
}
