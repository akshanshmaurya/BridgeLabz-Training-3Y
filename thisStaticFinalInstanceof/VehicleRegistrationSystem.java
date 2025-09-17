
package thisStaticFinalInstanceof;
// Sample Program 6: Vehicle Registration System
// Demonstrates: static, this, final, instanceof

public class VehicleRegistrationSystem {
    static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public VehicleRegistrationSystem(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to: " + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof VehicleRegistrationSystem) {
            System.out.println("Reg No: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        VehicleRegistrationSystem v1 = new VehicleRegistrationSystem("REG123", "Alice", "Car");
        VehicleRegistrationSystem v2 = new VehicleRegistrationSystem("REG456", "Bob", "Bike");
        v1.displayDetails();
        v2.displayDetails();
        VehicleRegistrationSystem.updateRegistrationFee(600.0);
    }
}
