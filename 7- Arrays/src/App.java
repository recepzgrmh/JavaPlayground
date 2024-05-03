public class App {
    public static void main(String[] args) throws Exception {

        // Arrays are used to store multiple values in a single variable, instead of
        // declaring separate variables for each value.

        String cars[] = { "bmw", "mercedes", "volvo", "ford" };

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };

        // You can access an array element by referring to the index number.

        System.out.println(cars[0]);
        System.out.println(numbers[4]);

        // Array indexes start with 0: [0] is the first element. [1] is the second
        // element, etc.

        System.out.println("\ncars[2] --> " + cars[2]);
        cars[2] = "Audi";
        System.out.println("\ncars[2] --> " + cars[2]);

        // Finding the array's length

        System.out.println("length of the cars array : " + cars.length);

        // Writing the elements of the array

        System.out.println("\nelements of the array ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // you can also use the foreach loop
        System.out.println("\nelements of the array ");
        for (String car : cars) {
            System.out.println(car);
        }

        // Multidimensional Arrays
        System.out.println("\n\nMultidimensional Arrays");
        int multiNubmers[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(multiNubmers[2][2]);

        // Loop Through a Multi-Dimensional Array

        // You can also use a for loop inside another for loop to get the elements of a
        // two-dimensional array (we still have to point to the two indexes):

        int sum = 0;
        for (int i = 0; i < multiNubmers.length; i++) {
            for (int j = 0; j < multiNubmers[i].length; j++) {
                if (i == j) {
                    sum += multiNubmers[i][j];
                }
            }
        }

        System.out.println("Primary Diagonal Sum = " + sum);

    }
}
