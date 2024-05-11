package model;

public enum Command {
    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLY("multiply"),
    DIVIDE("divide"),
    EXIT("exit");
    
    public final String value;
    
    Command(String value) {
        this.value = value;
    }
    
    public static Command fromValue(String value) {
        for (Command command : Command.values()) {
            if (command.value.equals(value)) {
                return command;
            }
        }
        throw new IllegalArgumentException("Invalid command");
    }
}
