/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: Sep 25, 2026
 */
package expressions;

public class AbsoluteValue extends UnaryExpression {
    public AbsoluteValue(Expression operand) {
        super(operand, "abs");
    }

    @Override
    public double eval() {
        return Math.abs(this.operand.eval());
    }
}
