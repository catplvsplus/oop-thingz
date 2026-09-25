import expressions.AbsoluteValue;
import expressions.BinaryExpression;
import expressions.Expression;
import expressions.Negation;
import expressions.UnaryExpression;
import expressions.operations.Addition;
import expressions.operations.Division;
import expressions.operations.Multiplication;
import expressions.operations.Subtraction;

public class Main {
    public static void main(String[] args) {
        displayExpression(new Expression(2));
        displayExpression(new Addition(new Expression(3), new Expression(4)));
        displayExpression(new Division(
            new Multiplication(
                new Addition(new Expression(2), new Expression(3)),
                new Expression(4)
            ),
            new Subtraction(new Expression(5), new Expression(1))
        ));
        displayExpression(new Negation(new Expression(5)));
        displayExpression(new AbsoluteValue(new Negation(new Expression(5))));

        // displayExpression(new Division(new Expression(10), new Expression(0)));
        // displayExpression(new Expression(Double.NaN));
        // displayExpression(new Expression(Double.POSITIVE_INFINITY));
        // displayExpression(new BinaryExpression(new Expression(1), '%', new Expression(2)));
        // displayExpression(new UnaryExpression(new Expression(1), '*'));
    }

    public static void displayExpression(Expression expression) {
        System.out.println(expression);
        System.out.println("eval = " + expression.eval());
        System.out.println("height = " + expression.height());
        System.out.println();
    }
}