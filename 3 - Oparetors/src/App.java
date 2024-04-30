public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1 - Arithmetic Operators
         * + : Adds together two values
         * - : substract one value from another
         * * : multiplies two values
         * / : divides one value by another
         * % : Returns the division remainder
         * ++ : Increases the value of a variable by 1
         * -- : Decreases the value of a variable by 1
         */

        int num1 = 20;
        int num2 = 6;

        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Substraction : " + (num1 - num2));
        System.out.println("Mulitplication : " + (num1 * num2));
        System.out.println("Divison : " + ((1.0) * num1 / num2));
        System.out.println("Modulus : " + (num1 % num2));
        System.out.println("Increment : " + (num1++));
        System.out.println("Decrement : " + (num1--));

        /*
         * 2 - Assignment Operators
         * Opartor | Example | Same as
         * = -------> x = 5 -----> x = 5
         * += ------> x += 3 ----> x = x + 3
         * -= ------> x -= 3 ----> x = x - 3
         * *= ------> x *= 3 ----> x = x * 3
         * /= ------> x /= 3 ----> x = x / 3
         * %= ------> x %= 3 ----> x = x % 3
         * &= ------> x &= 3 ----> x = x & 3
         * |= ------> x |= 3 ----> x = x | 3
         * ^= ------> x ^= 3 ----> x = x ^ 3
         * >>= -----> x >>= 3 ---> x = x >> 3
         * <<= -----> x <<= 3 ---> x = x << 3
         * 
         * The bitwise AND operator (&) performs a bitwise AND operation between the
         * binary representations of two numbers. In x &= 3, it combines the bits of x
         * and 3 using the AND operation.
         * 
         * The bitwise OR operator (|) performs a bitwise OR operation between the
         * binary representations of two numbers. In x |= 3, it combines the bits of x
         * and 3 using the OR operation.
         * 
         * The bitwise XOR operator (^) performs a bitwise XOR operation between the
         * binary representations of two numbers. In x ^= 3, it combines the bits of x
         * and 3 using the XOR operation.
         * 
         * The right shift operator (>>) shifts the bits of a number to the right by a
         * specified number of positions. In x >>= 3, it shifts the bits of x three
         * positions to the right.
         * 
         * The left shift operator (<<) shifts the bits of a number to the left by a
         * specified number of positions. In x <<= 3, it shifts the bits of x three
         * positions to the left.
         * 
         */

        int x = 16;

        System.out.println(x += 3);
        System.out.println(x -= 3);
        System.out.println(x *= 3);
        System.out.println(x /= 3);
        System.out.println(x %= 3);
        System.out.println(x &= 3);
        System.out.println(x |= 3);
        System.out.println(x ^= 3);
        System.out.println(x >>= 3);
        System.out.println(x <<= 3);

        /*
         * 
         * 3 - Comparison Operators
         * 
         * Equal to : ==
         * Not equal : !=
         * Greater than : >
         * Less than : <
         * Greater than or equal to : >=
         * Less than or equal to : <=
         * 
         * 
         * 
         * 4 - Logical Operators
         * && Logical and Returns true if both statements are true
         * || Logical or Returns true if one of the statements is true
         * ! Logical not Reverse the result, returns false if the result is true
         * 
         * 
         * y = y > 0 ? 3 : 2 this experssion means that if "y > 0" is true then return
         * the first value else return the second value
         * 
         */

        int y = 10;
        y = y > 0 ? 3 : 2;
        System.out.println("y = y > 0 ? 3 : 2 ---> " + y);

        y = y < 0 ? 3 : 2;
        System.out.println("y = y > 0 ? 3 : 2 ---> " + y);

        y = y > 9 && y < 11 ? 3 : 2;
        System.out.println("y = y > 9 && y < 11 ? 3 : 2 ---> " + y);

        y = y > 9 || y < 11 ? 3 : 2;
        System.out.println("y = y > 9 || y < 11 ? 3 : 2 ---> " + y);
    }
}
