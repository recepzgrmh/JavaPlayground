public class Bird extends Animal {
    public Bird(String gender, String name, int age) {
        super(gender, age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("The bird tweets");
    }

}
