package inheritance.hierarchicalInheritance;
// Hierarchical Inheritance - School System with Different Roles
// Demonstrates: Hierarchical Inheritance

class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() {
        System.out.println("Teacher | Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() {
        System.out.println("Student | Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    public void displayRole() {
        System.out.println("Staff | Department: " + department);
    }
}

public class SchoolSystemRoles {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 35, "Math");
        Student s = new Student("Bob", 16, 10);
        Staff st = new Staff("Charlie", 40, "Admin");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
