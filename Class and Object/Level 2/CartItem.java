import java.util.ArrayList;
import java.util.Iterator;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();
        // Add items
        cart.add(new CartItem("Apple", 30.0, 2));
        cart.add(new CartItem("Banana", 10.0, 5));
        // Remove item by name
        String removeItem = "Banana";
        Iterator<CartItem> it = cart.iterator();
        while (it.hasNext()) {
            CartItem item = it.next();
            if (item.getItemName().equals(removeItem)) {
                it.remove();
                System.out.println(removeItem + " removed from cart.");
            }
        }
        // Display total cost
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: " + total);
    }
}
