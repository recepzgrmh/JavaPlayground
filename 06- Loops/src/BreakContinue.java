public class BreakContinue {
    public static void main(String[] args) {
        /*
         * BREAK
         * 
         * When encountered within a loop, it immediately terminates the loop and
         * transfers control to the statement immediately following the loop.
         * 
         * It is commonly used to exit a loop prematurely based on some condition.
         * 
         * 
         */

        for (int i = 0; i < 5; i++) {
            System.out.print("---> " + i);
            if (i == 4)
                break;
        }

        /*
         * 
         * CONTINUE
         * 
         * When encountered within a loop, it skips the rest of the current iteration of
         * the loop and proceeds with the next iteration.
         * 
         * It is useful when you want to skip certain iterations based on some condition
         * without terminating the entire loop.
         * 
         * 
         */
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print("---> " + i);
        }

    }
}
