import java.util.ArrayList;


class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}


class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        Employee emp = new Employee(name, role);
        employees.add(emp);
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println(" - " + e);
        }
    }

    
    public void closeDepartment() {
        System.out.println("Closing department: " + deptName);
        employees.clear(); 
    }
}


class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    
    public void shutdownCompany() {
        System.out.println("Shutting down company: " + companyName);
        for (Department d : departments) {
            d.closeDepartment();
        }
        departments.clear();
    }
}

public class CompanyAndDepartments {
     public static void main(String[] args) {
        
        Company techCorp = new Company("TechCorp");

        
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        
        itDept.addEmployee("Alice", "Developer");
        itDept.addEmployee("Bob", "System Admin");

        hrDept.addEmployee("Charlie", "Recruiter");
        hrDept.addEmployee("Diana", "HR Manager");

        
        techCorp.addDepartment(itDept);
        techCorp.addDepartment(hrDept);

        
        techCorp.showCompanyStructure();

        System.out.println("\n--- Now deleting company ---\n");
        
        techCorp.shutdownCompany();

        
        techCorp.showCompanyStructure(); 
    }
    
}
