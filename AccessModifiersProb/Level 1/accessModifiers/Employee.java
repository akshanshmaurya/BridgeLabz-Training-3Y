package accessModifiers;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public String level;

    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department); // protected
        System.out.println("Salary: " + getSalary()); // private via getter
        System.out.println("Level: " + level);
    }
}
