public class Phone extends Product {
    protected String mobileData;

    public Phone(String productId) {
        super(productId);
    }

    @Override
    public Phone initialize() {
        super.initialize();

        mobileData = Util.input("Enter your mobile data type: ");

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Mobile Data: " + mobileData;
    }
}
