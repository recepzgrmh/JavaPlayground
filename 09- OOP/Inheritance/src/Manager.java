public class Manager extends Employee {

    private String officeLocation;

    public Manager(String name, String department, int salary, String officeLocation) {
        super(name, department, salary);
        setOfficeLocation(officeLocation);
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void raiseSalary(int amount) {
        System.out.println("About " + amount + " salary increases were made");
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Manager's office location : " + getOfficeLocation());
    }
}
