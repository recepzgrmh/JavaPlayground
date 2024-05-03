public class FourthExample {

    // Method Overloading

    // With method overloading, multiple methods can have the same name with
    // different parameters

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(2, 3);
        double myNum2 = plusMethod(2.4, 1.2);

        System.out.println("int : " + myNum1 + "\ndouble : " + myNum2);
    }
}
