/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: Sep 25, 2026
 */
import expressions.AbsoluteValue;
import expressions.Expression;
import expressions.Negation;
import expressions.operations.Addition;
import expressions.operations.Division;
import expressions.operations.Multiplication;
import expressions.operations.Subtraction;

public class Main {
    public static void main(String[] args) {
        Expression two = new Expression(2);
        displayExpression(two);

        Addition sum = new Addition(new Expression(3), new Expression(4));
        displayExpression(sum);

        Division whole = new Division(
            new Multiplication(
                new Addition(new Expression(2), new Expression(3)),
                new Expression(4)
            ),
            new Subtraction(new Expression(5), new Expression(1))
        );
        displayExpression(whole);

        Negation negated = new Negation(new Expression(5));
        displayExpression(negated);

        AbsoluteValue magnitude = new AbsoluteValue(new Negation(new Expression(5)));
        displayExpression(magnitude);

        Division broken = new Division(new Expression(10), new Expression(0));
        displayExpression(broken);
    }

    public static void displayExpression(Expression expression) {
        System.out.println(expression);
        System.out.println("eval = " + expression.eval());
        System.out.println("height = " + expression.height());
        System.out.println();
    }
}