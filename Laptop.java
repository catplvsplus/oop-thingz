public class Laptop extends Product {
    private int ports;

    @Override
    public Laptop initialize() {
        super.initialize();

        ports = Integer.parseInt(Util.input("How many ports does your product has: "));

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Number of ports: " + ports;
    }
}
