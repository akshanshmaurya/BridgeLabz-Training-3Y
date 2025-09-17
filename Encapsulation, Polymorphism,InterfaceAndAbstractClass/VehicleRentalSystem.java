// Vehicle Rental System
// Demonstrates: Abstract Class, Interface, Encapsulation, Polymorphism

import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return getRentalRate() * 0.10; }
    @Override
    public String getInsuranceDetails() { return "Car Insurance Policy: " + insurancePolicyNumber; }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.7; }
    @Override
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    @Override
    public String getInsuranceDetails() { return "Bike Insurance Policy: " + insurancePolicyNumber; }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    @Override
    public double calculateInsurance() { return getRentalRate() * 0.15; }
    @Override
    public String getInsuranceDetails() { return "Truck Insurance Policy: " + insurancePolicyNumber; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000, "CARPOL123"));
        vehicles.add(new Bike("BIKE456", 500, "BIKEPOL456"));
        vehicles.add(new Truck("TRUCK789", 2000, "TRUCKPOL789"));

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " | Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost (5 days): " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails());
                System.out.println("Insurance Cost: " + ((Insurable)v).calculateInsurance());
            }
            System.out.println();
        }
    }
}
