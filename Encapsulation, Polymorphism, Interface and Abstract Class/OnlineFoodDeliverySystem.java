// Online Food Delivery System
// Demonstrates: Abstract Class, Interface, Encapsulation, Polymorphism

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.10; }
    @Override
    public String getDiscountDetails() { return "Veg Discount: 10%"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; } // extra charge
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    @Override
    public String getDiscountDetails() { return "Non-Veg Discount: 5%"; }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            double total = item.calculateTotalPrice();
            double discount = (item instanceof Discountable) ? ((Discountable)item).applyDiscount() : 0;
            System.out.println("Total Price: " + total + ", Discount: " + discount + ", Final Price: " + (total - discount));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Tikka", 250, 2),
            new NonVegItem("Chicken Curry", 300, 1)
        };
        processOrder(order);
    }
}
