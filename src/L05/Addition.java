package L05;

public class Addition extends Operations{
    @Override
    protected int calculate(int leftOperand, int rightOperand) {
        int result = leftOperand + rightOperand;
        this.previousResult = result;
        return result;
    }
}
