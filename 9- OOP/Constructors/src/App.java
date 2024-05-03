public class App {
    int modelYear;
    String modelName;

    public App(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) throws Exception {
        App car1 = new App(2022, "volvo");

        System.out.println(car1.modelName + " " + car1.modelYear);
    }

    // Access Modifiers

    /*
     * public : The class is accessible by any other class
     * private: The code is only accessible within the declared class
     * protected : The code is accessible in the same package and subclasses.
     * 
     */
}
