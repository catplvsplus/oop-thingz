package expressions;

public class Negation extends UnaryExpression {
    public Negation(Expression operand) {
        super(operand, '-');
    }

    @Override
    public double eval() {
        return -this.operand.eval();
    }
}
