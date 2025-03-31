package operation;

import expression.Expression;

public class Division extends Operation {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        if(right.evaluate() == 0) {
            throw new ArithmeticException("Division by 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
