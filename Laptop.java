/**
 * This class represents a Laptop product, which is a subclass of the Product class.
 * This class is used to create Laptop products in the program.
 */

public class Laptop extends Product {
    private int ports;

    // A constructor that initializes the laptop with a product ID.
    public Laptop(String productId) {
        super(productId);
    }

    // A method to initialize the laptop by prompting the user for input.
    // This method overrides the initialize method in the Product class to add additional properties specific to laptops.
    @Override
    public Laptop initialize() {
        super.initialize();

        ports = Util.inputInt("How many ports does your product has: ");

        return this;
    }

    // A method to return a string representation of the laptop.
    // This method overrides the toString method in the Product class to add additional properties specific to laptops.
    @Override
    public String toString() {
        return super.toString() + "\n  Number of ports: " + ports;
    }
}
