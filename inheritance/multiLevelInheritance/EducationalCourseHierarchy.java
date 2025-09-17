package inheritance.multiLevelInheritance;
// Multilevel Inheritance - Educational Course Hierarchy
// Demonstrates: Multilevel Inheritance

class Course {
    protected String courseName;
    protected int duration;
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    protected double fee;
    protected double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java OOPs", 30, "Udemy", true, 2000, 200);
        System.out.println("Course: " + poc.courseName + ", Platform: " + poc.platform + ", Fee: " + poc.fee + ", Discount: " + poc.discount);
    }
}
