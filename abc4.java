//MATH , BOOLEAN, LOOPS
public class abc4 {
    public static void main(String[] args) {
        // find maximun
        System.out.println(Math.max(10000, 300));
        // find minimum
        System.out.println(Math.min(900, 300));
        // find square root
        System.out.println(Math.sqrt(5));
        // find absolute value
        System.out.println(Math.abs(-9));
        // return any random number
        System.out.println(Math.random());

        // BOOLEAN
        Boolean bool = true;
        System.out.println(bool);

        // IF ELSE LOOP
        int l = 10;
        if (l <= 100) {
            System.out.println("Value is less than 100 !");
        } else {
            System.out.println("Value is greater than 1000 !");
        }

        // SWITCH
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
        }

        int alpha = 0;
        do {
            alpha++;
            System.out.println("Have a good day :)");
        } while (alpha < 10);

        int q;
        float w;
        for (q = 0; q < 10; q++) {
            System.out.println("Null");
        }

    }
}