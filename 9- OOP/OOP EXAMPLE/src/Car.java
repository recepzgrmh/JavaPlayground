public class Car {

    // fields, properties

    /*
     * public String color;
     * public String model;
     * public double engine;
     * public int doors;
     *
     * The usage isn't correct because fields should be private. If they were
     * public, we could access them everywhere in the code, which doesn't fit with
     * the encapsulation principle.
     * 
     */

    private String color;
    private String model;
    private double engine;
    private int doors;

    // Constructor Method
    public Car(String color, String model, double engine, int doors) {
        setColor(color);
        setDoors(doors);
        setEngine(engine);
        setModel(model);
    }

    // default constructor
    public Car() {
        /*
         * this.color = "None";
         * this.doors = 0;
         * this.engine = 0;
         * this.model = "None";
         */

        this("None", "None", 0, 0);
    }

    // Since we cannot access private variables in other files, we can define a
    // public method. Then, we can access the fields through this method

    public void setColor(String color) {
        this.color = color; // "this" refers to the instance variable
    }

    public String getColor() {
        return color;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setDoors(int doors) {
        // The purpose of Encapsulation is to set some limits on assignments. For
        // example, if a car does not have 3 doors, we only want it to have 4 or 2
        // doors.
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            this.doors = 0;
            System.out.println("The car must have 2 or 4 doors");
        }
    }

    public int getDoors() {
        return doors;
    }

    // method
    public void start() {
        System.out.println("Car was started");
    }

    public void stop() {
        System.out.println("Car was stopped");
    }

    public void getInfo() {
        System.out.println("Car's model " + getModel());
        System.out.println("Car's color " + getColor());
        System.out.println("Number of door in the car " + getDoors());
        System.out.println("Car's engine " + getEngine());
    }

}
