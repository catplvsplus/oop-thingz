public class Phone extends Product {
    protected String mobileData;

    @Override
    public Phone initialize() {
        super.initialize();

        mobileData = Util.input("Enter your mobile data type: ");

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMobile Data: " + mobileData;
    }
}
