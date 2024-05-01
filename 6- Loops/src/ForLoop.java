public class ForLoop {
    public static void main(String[] args) {
        /*
         * 
         * If we know exactly how many times we want to loop through a block of code, We
         * can use the for loop intead of others
         * 
         * for(statement 1; statement 2; statement 3){
         * some codes her;
         * }
         * 
         * Statement 1 is executed (one time) before the execution of the code block.
         * 
         * Statement 2 defines the condition for executing the code block.
         * 
         * Statement 3 is executed (every time) after the code block has been executed.
         * 
         * I got this explanation from w3schools
         * 
         */

        // Writing numbers from 0 to 10
        for (int i = 0; i < 11; i++) {
            System.out.print(" --> " + i);
        }

        System.out.println("\n");

        // Writing the odd numbers from 0 to 20
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(" --> " + i);
        }

    }
}
