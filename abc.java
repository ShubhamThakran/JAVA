//variable
public class abc {
    public static void main(String[] args) {

        // STRING
        String name = "John";
        System.out.println(name);

        // INTEGER
        int x = 100;
        System.out.println(x);

        // create a variable without assigning the value and asign it later
        int y;
        y = 777;
        System.out.println(y);

        // overwrite an existing variable value
        y = 666;
        System.out.println(y);

        // create a final varaible
        final int z = 555;
        System.out.println(z);

        // combine text and variable
        System.out.println(name + " " + x);

        // add a variable on diaplay
        System.out.println(x + y);

        // declare many variable with same type
        int a = 1, b = 2, c = 4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}