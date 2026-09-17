/**
 * This class represents an iPhone product, which is a subclass of the Phone class.
 * This class is used to create iPhone products in the program.
 */

public class IPhone extends Phone {
    private boolean airDrop = true;
    private String appleId;

    // A constructor that initializes the iPhone with a product ID.
    public IPhone(String productId) {
        super(productId);
    }

    // A method to initialize the iPhone by prompting the user for input.
    // This method overrides the initialize method in the Phone class to add additional properties specific to iPhones.
    @Override
    public IPhone initialize() {
        super.initialize();

        appleId = Util.input("What is your Apple ID: ");

        return this;
    }

    // A method to return a string representation of the iPhone.
    // This method overrides the toString method in the Phone class to add additional properties specific to iPhones.
    @Override
    public String toString() {
        return super.toString() + "\n  Air Drop: " + airDrop + "\n  Apple ID: " + appleId;
    }
}
