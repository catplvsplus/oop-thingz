public class Product {
    private String productId;
    private String name;
    private double price;
    private int storage;

    public Product(String productId) {
        this.productId = productId;
    }

    public Product initialize() {
        name = Util.input("Enter a product name: ");
        price = Double.parseDouble(Util.input("Enter a product price: "));
        storage = Integer.parseInt(Util.input("How much storage does your product has (GB): "));

        return this;
    }

    public String toString() {
        return "  ID: " + productId +"\n  Name: " + name + "\n  Price: " + price + "\n  Storage: " + storage + "GB";
    }
}
