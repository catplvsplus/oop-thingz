/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: Sep 25, 2026
 */
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
