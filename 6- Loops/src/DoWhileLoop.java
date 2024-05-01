public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * 
         * Do-While Loop is a variant of While Loop. This loop will execute the code
         * block once, before checking if the condition is true. If it is true then it
         * will repeat the loop as long as the condiiton is true
         * 
         * Do{
         * Some codes here
         * }while(expression);
         * 
         */

        // Writing numbers from 0 to 10
        int i = 0;
        do {
            System.out.print(" --> " + i);
            i++;
        } while (i < 11);

        //
        i = 11;
        do {
            System.out.print("\n --> " + i);
            i++;
        } while (i < 11);

        /*
         * 
         * It is suitable when you want to execute the loop body at least once,
         * regardless of the condition.
         * 
         */
    }
}
