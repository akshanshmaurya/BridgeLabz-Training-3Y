// Ride-Hailing Application
// Demonstrates: Abstract Class, Interface, Encapsulation, Polymorphism

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public String getCurrentLocation() { return currentLocation; }
    public void setCurrentLocation(String location) { this.currentLocation = location; }
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm + ", Location: " + currentLocation;
    }
    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return super.getCurrentLocation(); }
    @Override
    public void updateLocation(String location) { setCurrentLocation(location); }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    @Override
    public String getCurrentLocation() { return super.getCurrentLocation(); }
    @Override
    public void updateLocation(String location) { setCurrentLocation(location); }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.6; }
    @Override
    public String getCurrentLocation() { return super.getCurrentLocation(); }
    @Override
    public void updateLocation(String location) { setCurrentLocation(location); }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("CAR001", "Alice", 20),
            new Bike("BIKE002", "Bob", 15),
            new Auto("AUTO003", "Charlie", 10)
        };
        double[] distances = {10, 5, 8};
        for (int i = 0; i < rides.length; i++) {
            rides[i].setCurrentLocation("Location" + (i+1));
            System.out.println(rides[i].getVehicleDetails());
            System.out.println("Fare for " + distances[i] + " km: " + rides[i].calculateFare(distances[i]));
            if (rides[i] instanceof GPS) {
                ((GPS)rides[i]).updateLocation("NewLocation" + (i+1));
                System.out.println("Updated Location: " + ((GPS)rides[i]).getCurrentLocation());
            }
            System.out.println();
        }
    }
}
