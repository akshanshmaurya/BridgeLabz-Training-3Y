package instanceVsClassVariable;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }


    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(750.0);
        Vehicle v2 = new Vehicle("Bob", "Bike");
        v2.displayVehicleDetails();
    }
}
