public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee() {
        this("None", "None", 0);
    }

    public Employee(String name, String department, int salary) {
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void showInfos() {
        System.out.println("Employee's id " + getSalary());
        System.out.println("Employee's name  " + getName());
        System.out.println("Employee's department " + getDepartment());
    }

}
