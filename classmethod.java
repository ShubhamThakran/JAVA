//CLASS METHOD
public class classmethod {
    static void myMethod() { // creating the method
        System.out.println("Hello World !");
    }

    
    //static method
    static void staticMethod(){
        System.out.println("Static Method");
    }

    //public method
    public void publicMethod(){
        System.out.println("Public Method");
    }

    //Main Method
    public static void main(String[] args) {
        myMethod();      //call myMethod() static method
        staticMethod();  //call static mathod
        
        //create an object of main for public method
        classmethod myObj4=new classmethod(); //object created
        myObj4.publicMethod();
    }

}