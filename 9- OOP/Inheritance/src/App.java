public class App {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager("Recep", "Software", 2000, "İzmir");
        manager.showInfos();
        manager.raiseSalary(100);
    }
}
