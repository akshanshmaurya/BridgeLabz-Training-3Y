package inheritance.hybridInheritance;
// Hybrid Inheritance - Vehicle Management System
// Demonstrates: Hybrid Inheritance (Inheritance + Interface)

interface Refuelable {
    void refuel();
}

class Vehicle {
    protected int maxSpeed;
    protected String model;
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    public void charge() {
        System.out.println("Electric vehicle charging...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle refueling...");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        ev.charge();
        pv.refuel();
    }
}
