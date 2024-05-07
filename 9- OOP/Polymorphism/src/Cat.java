public class Cat extends Animal {
    public Cat(String gender, String name, int age) {
        super(gender, age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
