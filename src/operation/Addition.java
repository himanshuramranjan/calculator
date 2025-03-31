package operation;

import expression.Expression;

public class Addition extends Operation {

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
