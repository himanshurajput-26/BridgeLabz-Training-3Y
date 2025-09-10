package Java_OOPS.Level2;

// CartItem.java
class CartItem {
    String itemName;
    int quantity;
    double price;

    CartItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }

    public void displayCartItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total: " + getTotal());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 2, 45000);
        CartItem item2 = new CartItem("Mouse", 3, 500);

        item1.displayCartItem();
        item2.displayCartItem();
    }
}
