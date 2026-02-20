package L05;

public abstract class Operations {
    protected int previousResult;

    protected abstract int calculate(int leftOperand, int rightOperand);

    protected int returnPrevious(){
        return previousResult;
    }
}