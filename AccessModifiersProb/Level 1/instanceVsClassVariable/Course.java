package instanceVsClassVariable;
public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 15000.0);
        c1.displayCourseDetails();
        Course.updateInstituteName("TechLabz");
        Course c2 = new Course("Python", 4, 12000.0);
        c2.displayCourseDetails();
    }
}
