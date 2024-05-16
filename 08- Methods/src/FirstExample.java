public class FirstExample {

    public static void main(String[] args) throws Exception {
        /*
         * A method must be declared within a class. It is defined with the name of the
         * method, followed by parentheses (). Java provides some pre-defined methods,
         * such as System.out.println(), but you can also create your own methods to
         * perform certain actions:
         * 
         */

        HelloWorld();

        // A method can also be called multiple times:

        HelloWorld();
        HelloWorld();
        HelloWorld();
        HelloWorld();
    }

    public static void HelloWorld() {
        System.out.println("Hello World");
    }
}
