package L05;

public class Multiplication extends Operations{
    @Override
    protected int calculate(int leftOperand, int rightOperand) {
        int result = leftOperand*rightOperand;
        previousResult = result;
        return result;
    }
}
