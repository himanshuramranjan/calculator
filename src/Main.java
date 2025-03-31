import expression.Expression;
import expression.Number;
import operation.Addition;
import operation.Multiplication;

public class Main {
    public static void main(String[] args) {

        Expression num1 = new Number(10);
        Expression num2 = new Number(5);
        Expression num3 = new Number(2);

        // (10 + 5) * 2
        Expression addition = new Addition(num1, num2);
        Expression multiplication = new Multiplication(addition, num3);

        System.out.println("Result: " + multiplication.evaluate()); // Output: 30.0
    }
}