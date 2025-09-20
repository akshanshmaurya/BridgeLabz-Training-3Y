import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String name;
    private List<Doctor> doctors;  // Association with multiple doctors

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " is consulting with:");
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients; // Association with multiple patients

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Getter for specialization (fixes the access error)
    public String getSpecialization() {
        return specialization;
    }

    // Communication: doctor consults with patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // maintain bidirectional association
        }
        System.out.println("Dr. " + name + " (" + specialization + ") is consulting with patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " is consulting with patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

// Hospital class (holds doctors & patients)
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            // use getter instead of accessing private field directly
            System.out.println(" - Dr. " + d.getName() + " (" + d.getSpecialization() + ")");
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

// Main class to test
public class HospitalsAndDoctors {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");
    }

}

        // Creat
