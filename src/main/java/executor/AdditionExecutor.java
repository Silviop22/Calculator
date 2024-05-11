package executor;

public class AdditionExecutor implements Executor {
    private final int firstArgument;
    private final int secondArgument;
    
    public AdditionExecutor(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }
    
    @Override
    public int execute() {
        return firstArgument + secondArgument;
    }
}
