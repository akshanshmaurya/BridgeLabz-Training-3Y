import java.util.ArrayList;
import java.util.List;


class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return productName + " ($" + price + ")";
    }
}


class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " placed by " + customer.getName());
        System.out.println("Products in this order:");
        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p);
            total += p.getPrice();
        }
        System.out.println("Total Amount: $" + total);
        System.out.println("--------------------------------");
    }
}


class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public Order placeOrder(int orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        System.out.println(name + " placed a new order (ID: " + orderId + ")");
        return order;
    }

    public void showCustomerOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}


public class ECommerce {
    public static void main(String[] args) {
        
        Product laptop = new Product("Laptop", 1200.50);
        Product phone = new Product("Smartphone", 800.00);
        Product headphones = new Product("Headphones", 150.75);
        Product book = new Product("Book", 25.00);

    
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        
        Order o1 = c1.placeOrder(101);
        o1.addProduct(laptop);
        o1.addProduct(headphones);

        
        Order o2 = c2.placeOrder(102);
        o2.addProduct(phone);
        o2.addProduct(book);

        
        Order o3 = c1.placeOrder(103);
        o3.addProduct(book);
        o3.addProduct(headphones);

        System.out.println();

        
        c1.showCustomerOrders();
        c2.showCustomerOrders();
    }
}

