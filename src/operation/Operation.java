package operation;

import expression.Expression;

public abstract class Operation implements Expression {
    protected Expression left;
    protected Expression right;

    protected Operation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
