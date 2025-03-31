package expression;

public class Number implements Expression {

    private final double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
