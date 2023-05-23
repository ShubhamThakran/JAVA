//ATTRIBUTES
public class classattribute {
    // multiple attributes
    int x = 5;
    int y = 10;
    final int z = 90;

    public static void main(String[] args) {
        // mutiple objects
        classattribute myObj = new classattribute();
        classattribute myObj2 = new classattribute();
        System.out.println(myObj.x);
        System.out.println(myObj2.y);

        // modify attribute
        myObj.x = 100; // x now is 100
        System.out.println(myObj.x);

        // no ability to override existing value by using final
        classattribute myObj3 = new classattribute();
        System.out.println(myObj3.z);

        // calling multiple attributes together
        System.out.println(myObj.x + myObj2.y + myObj3.z);
    }
}