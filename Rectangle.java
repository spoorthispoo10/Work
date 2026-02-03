public class Rectangle{
    double length;
    double width;
    Rectangle(double length,double width){
    this.length=length;
    this.width=width;
}
double area(){
    return length * width;
}
double perimeter(){
    return 2*(length + width);
}


    public static void main(String[]args){
        Rectangle rect1 = new Rectangle(10,5);
        System.out.println("Length: " + rect1.length);
        System.out.println("Width: " + rect1.width);
        System.out.println("Area: " + rect1.area());
        System.out.println("Perimeter: " + rect1.perimeter());
    }
}
