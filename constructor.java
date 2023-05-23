//CONSTRUCTOR
public class constructor {
    int x;

    public constructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        constructor obj = new constructor(4);
        System.out.println(obj.x);
    }
}