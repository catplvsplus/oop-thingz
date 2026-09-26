/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: Sep 25, 2026
 */
package expressions.operations;

import expressions.BinaryExpression;
import expressions.Expression;

public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, '-', right);
    }

    @Override
    public double eval() {
        return this.left.eval() - this.right.eval();
    }
}
