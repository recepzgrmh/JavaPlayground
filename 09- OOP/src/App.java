
// public class App is a class as you can see from its name

public class App {

    // Java - What are Classes and Objects?

    // A Class is a template or blueprint for creating Objects; meanwhile, an Object
    // is an Instance of a Class.

    // int x = 4 is an attribute
    int x = 4;

    public static void main(String[] args) throws Exception {

        App myObj = new App();
        System.out.println(myObj.x);

        // override
        myObj.x = 2;
        System.out.println(myObj.x);

        // If you don't want the ability to override existing values, declare the
        // attribute as final
        // final int x = 4

    }
}
