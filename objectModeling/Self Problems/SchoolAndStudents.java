import java.util.ArrayList;
import java.util.List;


class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    
    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }
}


class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); 
        }
    }

    
    public void showCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}


class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}


public class SchoolAndStudents {
    public static void main(String[] args) {
        
        School mySchool = new School("Greenwood High");


        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        
        mySchool.addStudent(s1);
        mySchool.addStudent(s2);

        
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("History");

        
        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);

        s2.enrollInCourse(c2);
        s2.enrollInCourse(c3);

        
        mySchool.showStudents();
        System.out.println();

        
        s1.showCourses();
        s2.showCourses();
        System.out.println();

        
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        c3.showEnrolledStudents();
    }
    
}
