public class Android extends Phone {
    private boolean quickShare = true;
    private boolean reverseWirelessCharging;

    @Override
    public Android initialize() {
        super.initialize();

        reverseWirelessCharging = !Util.input("Does your device use reverse reverse wireless charging (Y/n): ").equalsIgnoreCase("n");

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHas Quick Share: " + quickShare + "\nHas reverse wireless charging: " + reverseWirelessCharging;
    }
}
