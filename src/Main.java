
public class Main {
    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;
        char operationChoice;

        // Initialization: Calling Operation Class from Operation.java
        Operations operation = new Operations(num1, num2);

        // Initialization: Welcome Message
        operationChoice = InputValidator.validateOperationChoice();

        switch (operationChoice) {
            case 'A' -> {
                System.out.println("Addition:");
                InputValidator.enterNumbers(operation);
                operation.add();
                operation.displayResult();
            }
            case 'S' -> {
                System.out.println("Subtraction:");
                InputValidator.enterNumbers(operation);
                operation.subtract();
                operation.displayResult();
            }
            case 'M' -> {
                System.out.println("Multiplication:");
                InputValidator.enterNumbers(operation);
                operation.multiply();
                operation.displayResult();
            }
            case 'D' -> {
                System.out.println("Division:");
                InputValidator.validateDivisionInputs(operation);
                operation.displayResult();
            }
            default -> System.out.println("Invalid input: Enter correct options (A, S, M, or D)! Please try again.");
        }

        // Exit: Close Scanner
        InputValidator.closeScanner();
    }
}
