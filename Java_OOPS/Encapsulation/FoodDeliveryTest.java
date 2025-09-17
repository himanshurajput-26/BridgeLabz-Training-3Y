package Java_OOPS.Encapsulation;

interface Discountable {
    double applyDiscount(double price);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName; this.price = price; this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println(itemName + " | Price: " + price + " | Qty: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount(double price) { return price * 0.9; }

    @Override
    public String getDiscountDetails() { return "10% discount on Veg items"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 20; }

    @Override
    public double applyDiscount(double price) { return price * 0.85; }

    @Override
    public String getDiscountDetails() { return "15% discount on Non-Veg items"; }
}

public class FoodDeliveryTest {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken", 300, 1);

        for (FoodItem f : new FoodItem[]{f1, f2}) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            if (f instanceof Discountable) {
                total = ((Discountable)f).applyDiscount(total);
                System.out.println(((Discountable)f).getDiscountDetails());
            }
            System.out.println("Final Price: " + total + "\n");
        }
    }
}
