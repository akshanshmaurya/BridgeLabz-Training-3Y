
package thisStaticFinalInstanceof;
// Sample Program 3: Employee Management System
// Demonstrates: static, this, final, instanceof

public class EmployeeManagementSystem {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public EmployeeManagementSystem(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof EmployeeManagementSystem) {
            System.out.println("Company: " + companyName + ", ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem e1 = new EmployeeManagementSystem(1, "Alice", "Manager");
        EmployeeManagementSystem e2 = new EmployeeManagementSystem(2, "Bob", "Developer");
        e1.displayDetails();
        e2.displayDetails();
        EmployeeManagementSystem.displayTotalEmployees();
    }
}
