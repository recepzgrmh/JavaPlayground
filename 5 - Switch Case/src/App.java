public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 
         * switch(expression){
         * case x:
         * some codes here;
         * break;
         * 
         * case y:
         * some codes here too;
         * break;
         * 
         * default:
         * some codes here again;
         * }
         * 
         */

        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day: " + dayName);
    }
}
