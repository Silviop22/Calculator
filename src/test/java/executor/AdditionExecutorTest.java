package executor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AdditionExecutorTest {
    
    @ParameterizedTest
    @MethodSource("getAdditionArguments")
    void execute(int firstArgument, int secondArgument, int expected) {
        int actual = new AdditionExecutor(firstArgument, secondArgument).execute();
        assertEquals(expected, actual);
    }
    
    private static Stream<Arguments> getAdditionArguments() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(14, 456, 470),
                Arguments.of(0, 5, 5),
                Arguments.of(-3, 6, 3)
        );
    }
}