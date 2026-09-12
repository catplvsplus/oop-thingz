public class Apple extends Phone {
    private boolean airDrop = true;
    private String appleId;

    @Override
    public Apple initialize() {
        super.initialize();

        appleId = Util.input("What is your Apple ID: ");

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Air Drop: " + airDrop + "\n  Apple ID: " + appleId;
    }
}
