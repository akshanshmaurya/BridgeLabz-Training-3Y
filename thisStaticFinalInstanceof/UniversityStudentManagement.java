
package thisStaticFinalInstanceof;
// Sample Program 5: University Student Management
// Demonstrates: static, this, final, instanceof

public class UniversityStudentManagement {
    static String universityName = "Global University";
    static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public UniversityStudentManagement(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof UniversityStudentManagement) {
            System.out.println("University: " + universityName + ", Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        UniversityStudentManagement s1 = new UniversityStudentManagement(1, "Alice", "A");
        UniversityStudentManagement s2 = new UniversityStudentManagement(2, "Bob", "B");
        s1.displayDetails();
        s2.displayDetails();
        UniversityStudentManagement.displayTotalStudents();
    }
}
