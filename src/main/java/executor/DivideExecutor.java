package executor;

import java.lang.ref.SoftReference;

public class DivideExecutor implements Executor {
    private final int firstArgument;
    private final int secondArgument;
    
    public DivideExecutor(int firstArgument, int secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }
    
    @Override
    public int execute() {
        return firstArgument / secondArgument;
    }
}
