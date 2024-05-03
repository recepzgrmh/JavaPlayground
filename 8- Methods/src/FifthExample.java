public class FifthExample {

    // Java Recursion

    // Recursion is the technique of making a function call itself. This technique
    // provides a way to break complicated problems down into simple problems which
    // are easier to solve.

    static int sum(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + sum(x - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
