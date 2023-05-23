//USING MULTIPLE CLASS
public class classmethod2 {
    public void full() {
        System.out.println("Car is in full speed.");
    }

    public void speed(int maxspeed) {
        System.out.println("Max speed is: " + maxspeed);
    }
}

class second {
    public static void main(String[] args) {
        classmethod2 car = new classmethod2();
        car.full();
        car.speed(200);
    }
}