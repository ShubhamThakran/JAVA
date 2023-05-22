//Strings
public class abc3 {
    public static void main(String[] args) {
        // create a string with quotes
        String b = "\'Hello dear\'";
        System.out.println(b);
        // find length of the dtring
        System.out.println(b.length());
        // convert string to uper case and lower case
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        // find string in a string
        System.out.println(b.indexOf("dear"));
        // string concatenation
        String a = "My name is Shubham.";
        System.out.println(b + " " + a);
        // add number with string
        int c = 7;
        System.out.println(a + c);
    }
}