public class Product {
    private String productId;
    private String name;
    private double price;
    private int storage;

    public Product initialize() {
        productId = Util.input("Enter a product ID: ");
        name = Util.input("Enter a product name: ");
        price = Double.parseDouble(Util.input("Enter a product price: "));
        storage = Integer.parseInt("How much storage does your product has (GB): ");

        return this;
    }

    public String toString() {
        return "ID: " + productId + "\nName: " + name + "\nPrice: " + price + "\nStorage: " + storage + "GB";
    }
}
