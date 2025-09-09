package Java_OOPS.Level1;

class Item {
    private String itemCode;
    private String itemName;
    private double price;


    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Item Price: " + price);
    }


    public double totalCost(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        return price * quantity;
    }


    public static void main(String[] args) {
        Item i1 = new Item("01AA", "Water Bottle", 500);
        i1.displayDetails();
        int qty = 3;
        System.out.println("Total cost for " + qty + " units: " + i1.totalCost(qty));
    }
}