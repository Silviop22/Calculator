package executor;

public class SubtractExecutor implements Executor {
    private final int firstArgument;
    private final int secondArgument;
    
    public SubtractExecutor(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }
    
    @Override
    public int execute() {
        return firstArgument - secondArgument;
    }
}
