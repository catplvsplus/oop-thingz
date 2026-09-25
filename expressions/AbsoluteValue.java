package expressions;

public class AbsoluteValue extends UnaryExpression {
    public AbsoluteValue(Expression operand) {
        super(operand, '+');
    }

    @Override
    public double eval() {
        return Math.abs(this.operand.eval());
    }
}
