import java.util.ArrayList;
import java.util.List;

// Faculty class (Aggregation: can exist outside of University)
class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return name + " (" + specialization + ")";
    }
}

// Department class (Composition: belongs to University only)
class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Department: " + deptName;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments; // Composition
    private List<Faculty> faculties;      // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add Department (composition)
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Add Faculty (aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Show university structure
    public void showStructure() {
        System.out.println("University: " + name);

        System.out.println(" Departments:");
        for (Department d : departments) {
            System.out.println("  - " + d.getDeptName());
        }

        System.out.println(" Faculties:");
        for (Faculty f : faculties) {
            System.out.println("  - " + f);
        }
    }

    // Shut down university (Composition: delete all departments)
    public void shutDownUniversity() {
        System.out.println("\nShutting down university: " + name);
        departments.clear();  // Departments vanish with the University
        // Faculties remain (aggregation)
    }
}


public class UniversitywithFaculties {
    public static void main(String[] args) {
        // Create University
        University uni = new University("Oxford University");

        // Add Departments (Composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mathematics");
        uni.addDepartment("Physics");

        // Create Faculty independently
        Faculty f1 = new Faculty("Alice", "AI & ML");
        Faculty f2 = new Faculty("Bob", "Quantum Physics");
        Faculty f3 = new Faculty("Charlie", "Algebra");

        // Add Faculties to University (Aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);

        // Show structure
        uni.showStructure();

        // Shut down university
        uni.shutDownUniversity();

        // Show structure again (Departments gone, Faculties still exist)
        System.out.println("\nAfter shutting down university:");
        uni.showStructure();

        // Faculties still exist independently
        System.out.println("\nIndependent Faculties still exist:");
        System.out.println(" - " + f1);
        System.out.println(" - " + f2);
        System.out.println(" - " + f3);
    }
    
}
