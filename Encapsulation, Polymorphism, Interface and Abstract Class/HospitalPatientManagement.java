// Hospital Patient Management
// Demonstrates: Abstract Class, Interface, Encapsulation, Polymorphism

import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }
    public void addToMedicalHistory(String record) { medicalHistory.add(record); }
    public List<String> getMedicalHistory() { return medicalHistory; }
    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }
    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    public InPatient(int patientId, String name, int age, String diagnosis, double roomCharges) {
        super(patientId, name, age, diagnosis);
        this.roomCharges = roomCharges;
    }
    @Override
    public double calculateBill() { return roomCharges + 5000; }
    @Override
    public void addRecord(String record) { addToMedicalHistory(record); }
    @Override
    public List<String> viewRecords() { return getMedicalHistory(); }
}

class OutPatient extends Patient implements MedicalRecord {
    public OutPatient(int patientId, String name, int age, String diagnosis) {
        super(patientId, name, age, diagnosis);
    }
    @Override
    public double calculateBill() { return 1000; }
    @Override
    public void addRecord(String record) { addToMedicalHistory(record); }
    @Override
    public List<String> viewRecords() { return getMedicalHistory(); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Alice", 30, "Surgery", 8000),
            new OutPatient(2, "Bob", 25, "Checkup")
        };
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord)p).addRecord("Visit on 2025-09-17");
                System.out.println("Records: " + ((MedicalRecord)p).viewRecords());
            }
            System.out.println();
        }
    }
}
