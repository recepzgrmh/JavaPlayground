public class SecondExample {

    // Parameters and Arguments

    // Information can be passed to methods as parameter. Parameters act as
    // variables inside the method.

    public static void greetings(String name) {
        System.out.println("hello " + name);
    }

    // Multiple Parameters

    public static void introduce(int age, String name, int height) {
        System.out.printf("hello my name is %s, I'm %d years old. My height is %d", name, age, height);
    }

    public static void main(String[] args) {

        String name = "Recep Özgür";
        greetings(name);

        introduce(22, name, 180);

    }

}
