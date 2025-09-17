
package thisStaticFinalInstanceof;
// Sample Program 7: Hospital Management System
// Demonstrates: static, this, final, instanceof

public class HospitalManagementPatient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public HospitalManagementPatient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof HospitalManagementPatient) {
            System.out.println("Hospital: " + hospitalName + ", Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        HospitalManagementPatient p1 = new HospitalManagementPatient(1, "Alice", 30, "Fever");
        HospitalManagementPatient p2 = new HospitalManagementPatient(2, "Bob", 40, "Cold");
        p1.displayDetails();
        p2.displayDetails();
        HospitalManagementPatient.getTotalPatients();
    }
}
