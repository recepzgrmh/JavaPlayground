public class static_vs_public {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods can not be called without creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();

        static_vs_public myObj = new static_vs_public();
        myObj.myPublicMethod();
    }
}
