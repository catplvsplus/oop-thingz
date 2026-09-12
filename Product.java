public class Product {
    private String productId;
    private String name;
    private double price;

    public Product initialize() {
        productId = Util.input("Enter a product ID: ");
        name = Util.input("Enter a product name: ");
        price = Double.parseDouble(Util.input("Enter a product price: "));

        return this;
    }

    public String toString() {
        return "ID: " + productId + "\nName: " + name + "\nPrice: " + price;
    }
}
