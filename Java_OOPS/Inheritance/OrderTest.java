package Java_OOPS.Inheritance;

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId; this.orderDate = orderDate;
    }

    String getOrderStatus() { return "Order Placed"; }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() { return "Shipped with Tracking: " + trackingNumber; }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() { return "Delivered on " + deliveryDate; }
}

public class OrderTest {
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder("O1001", "2025-09-15", "TR1234", "2025-09-17");
        System.out.println(d1.getOrderStatus());
    }
}
