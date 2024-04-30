public class App {
    public static void main(String[] args) throws Exception {
        /*
         * JAVA DATA TYPES
         * 
         * 1 - Primitive Data types
         * int: Represent integers that are 32-bits long. It's default value is 0.
         * long: Represent long integers that are 64-bits long.
         * byte: It takes 8-bits number from -128 to 127
         * short: It takes 16-bits number from -32768 to 32767
         * float: Represent floating numbers that are 32-bits long. The letter 'f'
         * should be added to end. (for instance: 16.99f)
         * double: Represent bigger floating numbers that are 64-bits long.
         * char: Represent characthers that are 16-bits long.
         * boolean: Only takes 'true' or 'false' values.
         * 
         * 2 - Referance Data Types
         * Arrays: Used to group data of the same type
         * Classes: Used in Class Based Programming
         * Interfaces: Including method notifications and apply by classes
         * 
         * 3 - Null Data Types
         * null: It's the name given to the situation of not having any data
         * 
         */

        int intNumber = 22;
        System.out.println("int value : " + intNumber);

        long longNumber = 99999999;
        System.out.println("long value : " + longNumber);

        byte byteNumber = 126;
        System.out.println("byte value : " + byteNumber);

        short shortNumber = 32766;
        System.out.println("short value : " + shortNumber);

        float floatNumber = 16.99f;
        System.out.println("float value : " + floatNumber);

        double doubleNumber = 7878679;
        System.out.println("double value : " + doubleNumber);

        char charValue = 'f';
        System.out.println("Char value : " + charValue);

        boolean booleanValue = intNumber > 0;
        System.out.println("Boolean value : " + booleanValue);
    }
}
