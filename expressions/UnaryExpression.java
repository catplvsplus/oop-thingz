/**
 * Name: Ghexter P. Cortes
 * Student Number: 251012510
 * Section: BSCS 2-3
 * Date: Sep 25, 2026
 */
package expressions;

public class UnaryExpression extends Expression {
    public static final String[] SYMBOLS = {"-", "abs"};

    public Expression operand;
    public String symbol;

    public UnaryExpression(Expression operand, String symbol) {
        super(0);

        boolean isValidSymbol = false;

        for (String s : SYMBOLS) {
            if (isValidSymbol = s == symbol) break;
        }

        if (!isValidSymbol) {
            throw new IllegalArgumentException("Invalid symbol for unary expression: " + symbol);
        }

        this.operand = operand;
        this.symbol = symbol;
    }

    @Override
    public double eval() {
        return switch (this.symbol) {
            case "-" -> -this.operand.eval();
            case "abs" -> Math.abs(this.operand.eval());
            default -> 0;
        };
    }

    @Override
    public int height() {
        return this.operand.height() + 1;
    }

    @Override
    public String toString() {
        return "(" + this.symbol + " " + this.operand.toString() + ")";
    }
}
