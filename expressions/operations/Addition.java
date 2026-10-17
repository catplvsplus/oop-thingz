package expressions.operations;

import expressions.BinaryExpression;
import expressions.Expression;

public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
        super(left, '+', right);
    }

    @Override
    public double eval() {
        return this.left.eval() + this.right.eval();
    }
}
