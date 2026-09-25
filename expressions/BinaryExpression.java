package expressions;

public class BinaryExpression extends Expression {
    public static final char[] SYMBOLS = {'+', '-', '*', '/'};

    public Expression left;
    public Expression right;
    public char symbol;

    public BinaryExpression(Expression left, char symbol, Expression right) {
        super(0);

        boolean isValidSymbol = false;

        for (char s : SYMBOLS) {
            if (isValidSymbol = s == symbol) break;
        }

        if (!isValidSymbol) {
            throw new IllegalArgumentException("Invalid symbol for binary expression: " + symbol);
        }

        this.left = left;
        this.right = right;
        this.symbol = isValidSymbol ? symbol : '+';
    }

    @Override
    public double eval() {
        return switch (this.symbol) {
            case '+' -> this.left.eval() + this.right.eval();
            case '-' -> this.left.eval() - this.right.eval();
            case '*' -> this.left.eval() * this.right.eval();
            case '/' -> this.left.eval() / this.right.eval();
            default -> 0;
        };
    }

    @Override
    public int height() {
        return Math.max(this.left.height(), this.right.height()) + 1;
    }

    @Override
    public String toString() {
        return "(" + this.left.toString() + " " + this.symbol + " " + this.right.toString() + ")";
    }
}
