public class Car1 {

    private int speed;

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be between 0 and 200.");
        }
    }

    public static void main(String[] args) {
        Car1 c = new Car1();
        c.setSpeed(150);
        c.setSpeed(250); 
    }
}
