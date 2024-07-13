package executor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AdditionExecutorTest {
    
    
    @ParameterizedTest
    @MethodSource("provideArguments")
    void execute(int firstArgument, int secondArgument, int result) {
        //Arrange
        AdditionExecutor additionExecutor = new AdditionExecutor(firstArgument, secondArgument);
        
        //Act & Assert
        assertEquals(result, additionExecutor.execute());
    }
    
    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, -1, 1),
                Arguments.of(0, 3, 3),
                Arguments.of(3, 0, 3)
        );
    }
    
    
}