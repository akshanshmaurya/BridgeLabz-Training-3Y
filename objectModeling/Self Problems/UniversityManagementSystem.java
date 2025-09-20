import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private Professor professor; // one professor teaches this course
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Assign professor to this course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course " + courseName);
    }

    public Professor getProfessor() {
        return professor;
    }

    // Enroll a student
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + courseName);
    }

    // Show course details
    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
        System.out.println("---------------------------------");
    }
}

// Student class
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

    // Student enrolls in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showStudentCourses() {
        System.out.println("Courses of student " + name + ":");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
        System.out.println("---------------------------------");
    }
}

// Professor class
class Professor {
    private String name;
    private List<Course> teachingCourses;

    public Professor(String name) {
        this.name = name;
        this.teachingCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Professor teaches a course
    public void assignCourse(Course course) {
        teachingCourses.add(course);
        course.assignProfessor(this);
    }

    public void showTeachingCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        for (Course c : teachingCourses) {
            System.out.println(" - " + c.getCourseName());
        }
        System.out.println("---------------------------------");
    }
}

// University class
class University {
    private String universityName;
    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;

    public University(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
        System.out.println("Professors:");
        for (Professor p : professors) {
            System.out.println(" - " + p.getName());
        }
        System.out.println("Courses:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
        System.out.println("=================================");
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create University
        University uni = new University("ABC University");

        // Create Professors
        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        // Create Students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Create Courses
        Course c1 = new Course("Computer Science");
        Course c2 = new Course("Mathematics");

        // Add to University
        uni.addProfessor(p1);
        uni.addProfessor(p2);
        uni.addStudent(s1);
        uni.addStudent(s2);
    }
}
