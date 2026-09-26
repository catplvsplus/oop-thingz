/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: Sep 25, 2026
 */
package expressions.operations;

import expressions.BinaryExpression;
import expressions.Expression;

public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, '/', right);
    }

    @Override
    public double eval() {
        double right = this.right.eval();

        if (right == 0) {
            System.err.println("Error: Division by zero is undefined.");
            return 0;
        }

        return this.left.eval() / right;
    }
}
