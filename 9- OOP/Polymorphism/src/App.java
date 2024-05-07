public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Cat("male", "Boncuk", 2);
        Animal animal2 = new Dog("female", "Maviş", 4);
        Animal animal3 = new Bird("male", "İnci", 1);
        Animal animal4 = new Animal("female", 6, "Tazı");

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        animal4.makeSound();

    }
}
