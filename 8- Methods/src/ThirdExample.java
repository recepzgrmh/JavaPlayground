public class ThirdExample {
    // Return Values

    /*
     * 
     * If the return value is declared as 'void', the method does not return any
     * value. This means that the method only performs a specific process and does
     * not produce any value
     * 
     * If you want the method to return a value, you can use a primitive data
     * typeinstead of void, and use the return keyword inside the method
     * 
     */

    public static void main(String[] args) {
        System.out.println(sum(2, 3));

        int age = 22;
        System.out.println(checkAge(age));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static String checkAge(int age) {
        if (age < 18 && age >= 0) {
            return "You can't pass because your age is : " + age;
        } else if (age >= 18 && age < 100) {
            return "You can pass because your age is : " + age;
        } else {
            return "please enter a senseble age";
        }
    }
}
