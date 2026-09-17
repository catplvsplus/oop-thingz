/**
 * This class represents a Phone product, which is a subclass of the Product class.
 * This class is the base class for all phone products in the program, including Android and iPhone products.
 */

public class Phone extends Product {
    protected String mobileData;

    // A constructor that initializes the phone with a product ID.
    public Phone(String productId) {
        super(productId);
    }

    // A method to initialize the phone by prompting the user for input.
    // This method overrides the initialize method in the Product class to add additional properties specific to phones.
    @Override
    public Phone initialize() {
        super.initialize();

        mobileData = Util.input("Enter your mobile data type: ");

        return this;
    }

    // A method to return a string representation of the phone.
    // This method overrides the toString method in the Product class to add additional properties specific to phones.
    @Override
    public String toString() {
        return super.toString() + "\n  Mobile Data: " + mobileData;
    }
}
