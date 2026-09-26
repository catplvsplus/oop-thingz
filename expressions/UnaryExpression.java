/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: Sep 25, 2026
 */
package expressions;

public class UnaryExpression extends Expression {
    public static final char[] SYMBOLS = {'-', '+'};

    public Expression operand;
    public char symbol;

    public UnaryExpression(Expression operand, char symbol) {
        super(0);

        boolean isValidSymbol = false;

        for (char s : SYMBOLS) {
            if (isValidSymbol = s == symbol) break;
        }

        if (!isValidSymbol) {
            throw new IllegalArgumentException("Invalid symbol for unary expression: " + symbol);
        }

        this.operand = operand;
        this.symbol = isValidSymbol ? symbol : '+';
    }

    @Override
    public double eval() {
        return switch (this.symbol) {
            case '-' -> -this.operand.eval();
            case '+' -> Math.abs(this.operand.eval());
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return "(" + switch (this.symbol) {
            case '-' -> "- " + this.operand.toString();
            case '+' -> "abs " + this.operand.toString();
            default -> this.operand.toString();
        } + ")";
    }
}
