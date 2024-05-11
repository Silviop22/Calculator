import executor.AdditionExecutor;
import executor.DivideExecutor;
import executor.Executor;
import executor.MulitplyExecutor;
import executor.SubtractExecutor;
import model.Command;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();
    
    @ParameterizedTest
    @MethodSource("getExecutorArguments")
    public void testGetExecutorAddition(Command command, Executor expected) {
        Executor actual = calculator.getExecutor(command, 1, 2);
        assertEquals(expected.getClass(), actual.getClass());
    }
    
    @Test
    public void testGetExecutorThrowsException() {
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> calculator.getExecutor(Command.EXIT, 1, 2));
        assertEquals("Invalid command", e.getMessage());
    }
    
    private static Stream<Arguments> getExecutorArguments() {
        return Stream.of(
            Arguments.of(Command.ADD, new AdditionExecutor(1, 2)),
            Arguments.of(Command.SUBTRACT, new SubtractExecutor(1, 2)),
            Arguments.of(Command.MULTIPLY, new MulitplyExecutor(1, 2)),
            Arguments.of(Command.DIVIDE, new DivideExecutor(1, 2))
        );
    }
}