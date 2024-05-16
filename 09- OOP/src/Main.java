public class Main {

    // attributes
    int age;
    String name;

    // method
    static void hello() {
        System.out.print("Hello ");
    }

    public static void main(String[] args) {
        Main me = new Main();

        me.age = 22;
        me.name = "Recep Özgür";
        hello();
        System.out.printf("my name is %s, and I'm %d years old.", me.name, me.age);
    }

}
