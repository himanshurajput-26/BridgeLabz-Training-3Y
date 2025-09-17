package Java_OOPS.Object_Modelling;

import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();
    Order(int orderId) { this.orderId = orderId; }
    void addProduct(Product p) { products.add(p); }
    void showOrder() {
        System.out.println("Order #" + orderId);
        for (Product p : products) System.out.println(p.name + " - $" + p.price);
    }
}

class CustomerE {
    String name;
    List<Order> orders = new ArrayList<>();
    CustomerE(String name) { this.name = name; }
    void placeOrder(Order o) { orders.add(o); }
}

public class EcommerceTest {
    public static void main(String[] args) {
        CustomerE c1 = new CustomerE("Mike");
        Order o1 = new Order(101);
        o1.addProduct(new Product("Laptop", 800));
        o1.addProduct(new Product("Mouse", 20));
        c1.placeOrder(o1);
        o1.showOrder();
    }
}
