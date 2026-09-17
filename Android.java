/**
 * This class represents an Android phone product, which is a subclass of the Phone class.
 * This class is used to create Android phone products in the program.
 */

public class Android extends Phone {
    private boolean quickShare = true;
    private boolean reverseWirelessCharging;

    // A constructor that initializes the Android phone with a product ID.
    public Android(String productId) {
        super(productId);
    }

    // A method to initialize the Android phone by prompting the user for input.
    // This method overrides the initialize method in the Phone class to add additional properties specific to Android phones.
    @Override
    public Android initialize() {
        super.initialize();

        reverseWirelessCharging = Util.confirm("Does your device use reverse wireless charging (Y/n): ");

        return this;
    }

    // A method to return a string representation of the Android phone.
    // This method overrides the toString method in the Phone class to add additional properties specific to Android phones.
    @Override
    public String toString() {
        return super.toString() + "\n  Quick Share: " + quickShare + "\n  Reverse Wireless Charging: " + reverseWirelessCharging;
    }
}
