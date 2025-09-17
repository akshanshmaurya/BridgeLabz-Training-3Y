// E-Commerce Platform
// Demonstrates: Abstract Class, Interface, Encapsulation, Polymorphism

import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() { return getPrice() * 0.10; }
    @Override
    public double calculateTax() { return getPrice() * 0.18; }
    @Override
    public String getTaxDetails() { return "Electronics Tax: 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() { return getPrice() * 0.15; }
    @Override
    public double calculateTax() { return getPrice() * 0.05; }
    @Override
    public String getTaxDetails() { return "Clothing Tax: 5%"; }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " | Price: " + p.getPrice() + " | Tax: " + tax + " | Discount: " + discount + " | Final Price: " + finalPrice);
        }
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "T-Shirt", 1000));
        products.add(new Groceries(103, "Rice", 500));
        printFinalPrices(products);
    }
}
