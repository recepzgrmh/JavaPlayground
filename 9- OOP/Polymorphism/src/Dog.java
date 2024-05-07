public class Dog extends Animal {
    public Dog(String gender, String name, int age) {
        super(gender, age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
