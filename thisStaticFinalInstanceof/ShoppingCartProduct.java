
package thisStaticFinalInstanceof;
// Sample Program 4: Shopping Cart System
// Demonstrates: static, this, final, instanceof

public class ShoppingCartProduct {
    static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public ShoppingCartProduct(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public void displayDetails() {
        if (this instanceof ShoppingCartProduct) {
            System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        ShoppingCartProduct p1 = new ShoppingCartProduct(101, "Laptop", 50000, 1);
        ShoppingCartProduct p2 = new ShoppingCartProduct(102, "Mouse", 500, 2);
        p1.displayDetails();
        p2.displayDetails();
        ShoppingCartProduct.updateDiscount(15.0);
    }
}
