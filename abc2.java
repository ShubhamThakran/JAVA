//TYPE CASTING AND OPERATORS
public class abc2 {
    public static void main(String[] args) {
        // TYPE CASTING
        // widening
        int x = 100;
        float xx = x;
        System.out.println(xx);

        // narrowing
        float y = 100;
        int yy = (int) y;
        System.out.println(yy);

        // Operators
        float a = 100;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(b % a);
        System.out.println(a++);
        System.out.println(b--);
    }
}