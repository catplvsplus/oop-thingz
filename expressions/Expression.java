package expressions;

public class Expression {
    public double value;

    public Expression(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            System.err.println("ERROR: Invalid value for expression: " + value);
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public double eval() {
        return  this.value;
    }

    public int height() {
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
