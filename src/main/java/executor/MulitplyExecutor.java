package executor;

public class MulitplyExecutor implements Executor {
    private final int firstArgument;
    private final int secondArgument;
    
    public MulitplyExecutor(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }
    
    @Override
    public int execute() {
        return firstArgument * secondArgument;
    }
}
