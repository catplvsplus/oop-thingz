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
    }

    public static void displayExpression(Expression expression) {
        System.out.println(expression);
        System.out.println("eval = " + expression.eval());
        System.out.println("height = " + expression.height());
        System.out.println();
    }
}