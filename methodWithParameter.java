//METHOD WITH PARAMETER
public class methodWithParameter {
    static void myMethod(String f) {
        System.out.println(f + "Roy");
    }

    // Multiple parameter
    static void my(String d) {
        System.out.println(d + " is " + "boy");
    }

    // with return type
    static int me(int x) {
        return 5 + x;
    }

    // if else
    static void check(int age) {
        if (age < 18) {
            System.out.println("You are small");
        } else {
            System.out.println("You are adult");
        }
    }

    // overloading
    static int plus(int x, int y) {
        return x + y;
    }

    static double plus(double x, double y) {
        return x + y; 
    }

    public static void main(String[] args) {
        myMethod("Lisa");
        myMethod("Abhay");
        my("Abhay");
        System.out.println(me(3));
        check(32);
        int num = plus(9, 10);
        double mun = plus(8.9, 9.8);
        System.out.println("int:" + num);
        System.out.println("double:" + mun);
    }
}