public class Animal {
    private String gender;
    private int age;
    private String name;

    public Animal(String gender, int age, String name) {
        setAge(age);
        setName(name);
        setGender(gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.toLowerCase() == "female" || gender.toLowerCase() == "male") {
            this.gender = gender;
        } else {
            System.out.println("pls enter a senseble gender");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("pls enter a senseble age");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("The animel makes sound");
    }
}
