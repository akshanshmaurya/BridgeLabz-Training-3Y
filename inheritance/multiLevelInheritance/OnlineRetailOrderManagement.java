package inheritance.multiLevelInheritance;
// Multilevel Inheritance - Online Retail Order Management
// Demonstrates: Multilevel Inheritance

class Order {
    protected String orderId;
    protected String orderDate;
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() { return "Order Placed"; }
}

class ShippedOrder extends Order {
    protected String trackingNumber;
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public String getOrderStatus() { return "Order Shipped"; }
}

class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() { return "Order Delivered on " + deliveryDate; }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o = new Order("ORD001", "2025-09-17");
        ShippedOrder s = new ShippedOrder("ORD002", "2025-09-16", "TRK123");
        DeliveredOrder d = new DeliveredOrder("ORD003", "2025-09-15", "TRK456", "2025-09-17");
        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
