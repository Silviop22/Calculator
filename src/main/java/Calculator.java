import executor.AdditionExecutor;
import executor.DivideExecutor;
import executor.Executor;
import executor.MulitplyExecutor;
import executor.SubtractExecutor;
import model.Command;

import java.util.Scanner;

public class Calculator {
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command:");
            Command command = Command.fromValue(scanner.nextLine());
            if (Command.EXIT.equals(command)) {
                break;
            }
            
            System.out.println("Enter first argument");
            int firstArgument = scanner.nextInt();
            System.out.println("Enter second argument");
            int secondArgument = scanner.nextInt();
            
            Executor executor = getExecutor(command, firstArgument, secondArgument);
            try {
                System.out.println(executor.execute());
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed");
            } catch (IllegalArgumentException e) {
                System.out.println("Command not supported");
            }
            scanner.nextLine();
        }
    }
    
    public Executor getExecutor(Command command, int firstArgument, int secondArgument) {
        return switch (command) {
            case ADD -> new AdditionExecutor(firstArgument, secondArgument);
            case SUBTRACT -> new SubtractExecutor(firstArgument, secondArgument);
            case MULTIPLY -> new MulitplyExecutor(firstArgument, secondArgument);
            case DIVIDE -> new DivideExecutor(firstArgument, secondArgument);
            default -> throw new IllegalStateException("Invalid command");
        };
    }
}
