public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Conditions
         * 
         * Less than: a < b
         * Less than or equal to: a <= b
         * Greater than: a > b
         * Greater than or equal to: a >= b
         * Equal to a == b
         * Not Equal to: a != b
         * 
         */

        int a = 30;
        int b = 20;

        if (a > b) {
            System.out.println("a : " + a + " b : " + b + "\na is greater than b\n");
        }

        a = 10;

        if (a < b) {
            System.out.println("a : " + a + " b : " + b + "\na is less than b\n");
        }

        a = 30;
        b = 10;

        if (a < b) {
            System.out.println("a : " + a + " b : " + b + "\na is less than b\n");
        } else {
            System.out.println("a : " + a + " b : " + b + "\na is greater than b\n");
        }

        a = 10;
        b = 30;

        if (a < b) {
            System.out.println("a : " + a + " b : " + b + "\na is less than b\n");
        } else {
            System.out.println("a : " + a + " b : " + b + "\na is greater than b\n");
        }
    }
}
