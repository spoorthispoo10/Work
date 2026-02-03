class circle{
    double radius;
    
    circle(double radius){
        this.radius=radius;
    }
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    public static void main(String[]args){
        circle c1 = new circle(5);
        System.out.println("Radius: " + c1.radius);
        System.out.println("Area of Circle: " + c1.calculateArea());
    }
}