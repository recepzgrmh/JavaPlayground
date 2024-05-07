public class App {
    public static void main(String[] args) throws Exception {

        // fields: Fields represent attributes or properties of an object. They
        // encapsulate the state of an object.

        // object: An object is an instance of a class. It represents a specific entity
        // or concept and contains its own state and behavior.

        // method: A method is a function that is associated with a class or an object.

        // It defines the behavior or actions that objects of a class can perform.

        // Object Creation
        // Here, we instantiate a Car object using the constructor method. The
        // constructor
        // initializes the object's state by setting values for its fields.

        // Car car1 = new Car();

        /*
         * If fields were public variables, we could directly assign values like this:
         * 
         * car1.color = "blue"; car1.doors = 4; car1.model = "Renault Megane";
         * car1.engine = 2.4;
         * 
         * However, accessing fields directly like this violates the encapsulation
         * principle, as it exposes the internal state of the Car object. Encapsulation
         * helps in maintaining data integrity and controlling access to the object's
         * state.
         * 
         */

        /*
         * The above approach is not recommended because it exposes the internal state
         * of the Car object and violates the encapsulation principle. Instead, we use
         * setter methods to set the values of the fields, ensuring proper
         * encapsulation and data abstraction.
         * 
         * car1.setColor("blue"); car1.setDoors(4); car1.setEngine(2.4);
         * car1.setModel("Renault Megane");
         * 
         */

        // Constructor Method
        // Here, we create a new Car object using the constructor method. The
        // constructor method initializes the object's state with the provided values
        // for color, model, engine, and doors.

        Car car1 = new Car("blue", "Renault Megane", 2.4, 4);

        // Printing Car Information
        // Here, we call the getInfo() method of the Car class to print information
        // about the car, such as its model, color, number of doors, and engine
        // specifications.

        car1.getInfo();
    }
}
