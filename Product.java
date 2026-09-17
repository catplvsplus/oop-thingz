/**
 * This class is the base class for all products in the program.
 * It contains the common properties and methods that all products share.
 */

public class Product {
    private String productId;
    private String name;
    private double price;
    private int storage;

    // A constructor that initializes the product with a product ID.
    public Product(String productId) {
        this.productId = productId;
    }

    // A method to initialize the product by prompting the user for input.
    public Product initialize() {
        name = Util.input("Enter a product name: ");
        price = Util.inputDouble("Enter a product price: ");
        storage = Util.inputInt("How much storage does your product has (GB): ");

        return this;
    }

    // A method to return a string representation of the product.
    public String toString() {
        return "  ID: " + productId +"\n  Name: " + name + "\n  Price: " + price + "\n  Storage: " + storage + "GB";
    }
}
