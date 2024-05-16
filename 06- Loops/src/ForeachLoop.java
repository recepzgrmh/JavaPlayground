public class ForeachLoop {
    public static void main(String[] args) {
        /*
         * 
         * It is used specifically for iterating over elements of an array or a
         * collection.
         * 
         * It simplifies the syntax for iterating through collections or arrays by
         * eliminating the need for explicit indexing.
         * 
         * It cannot be used when you need to modify elements of the array or collection
         * during iteration
         * 
         * 
         */

        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        for (int num : numbers) {
            System.out.print(" ---> " + num);
        }
    }
}
