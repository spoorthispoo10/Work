class Area {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Square: " + a.area(4));
        System.out.println("Rectangle: " + a.area(5, 6));
        System.out.println("Circle: " + a.area(3.0));
    }
}
