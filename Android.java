public class Android extends Phone {
    private boolean quickShare = true;
    private boolean reverseWirelessCharging;

    public Android(String productId) {
        super(productId);
    }

    @Override
    public Android initialize() {
        super.initialize();

        reverseWirelessCharging = Util.confirm("Does your device use reverse reverse wireless charging (Y/n): ");

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Quick Share: " + quickShare + "\n  Reverse Wireless Charging: " + reverseWirelessCharging;
    }
}
