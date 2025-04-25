import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {

    // Initialization: Object Declaration
    private static final Scanner scn = new Scanner (System.in);

    // Method: validate user input
    public static double validateDoubleInput (String prompt){

        // Initialization: Variable Declaration
        double userInput;

        // Process: Loop until the condition became false.
        while (true) {
            // Error handling: Input Mismatch
            System.out.print(prompt);
            try {
                userInput = scn.nextDouble();
                return userInput;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input: Enter numbers only! Please try again.");
                scn.next();
            }
        }
    }

    // Method: Display user input (Enter numbers)
    public static void enterNumbers (Operations operation){

        // Process: Validate inputs (Double data type)
        double num1 = validateDoubleInput("Enter First number: ");
        double num2 = validateDoubleInput("Enter Second number: ");

        // Process: Setter numbers for operation
        operation.setNum1(num1);
        operation.setNum2(num2);
    }

    // Method: validation intended for Division Operation
    public static void validateDivisionInputs (Operations operation) {

        while (true) {
            enterNumbers(operation);
            if(operation.getNum2() == 0){
                System.out.println("Invalid input: Cannot divide by 0! Please try again.\n");
            }
            else {
                operation.divide();
                break;
            }
        }
    }

    // Method: Validate user input (char data type)
    public static char validateOperationChoice () {

        // Initialization: Variable Declaration
       char choiceResponse;
       String inputs;

        // Process: Loop until the condition became false.
       while (true) {
           System.out.print("Select operations (A = Addition, S = Subtraction, M = Multiplication, D= Division): ");

           // Error handling: Input Mismatch (char data type)
           try {
               inputs = scn.next().toUpperCase();
               scn.nextLine(); // clears buffer

               // Process: Validate input.length() equal only to 1.
               if (inputs.length() == 1) {
                   choiceResponse = inputs.charAt(0);

                   // Process: validate choices
                   if (choiceResponse == 'A' || choiceResponse == 'S' || choiceResponse == 'M' || choiceResponse == 'D') {
                       return choiceResponse;
                   }
                   else {
                       System.out.println("Invalid input: Enter correct options (A, S, M, or D)! Please try again.");
                   }
               }
               else {
                   System.out.println("Invalid input: Please enter only a single character.");
               }
           }
           catch (Exception e){
               System.out.println("Unexpected error occurred. Please try again.");
               scn.nextLine();
           }
       }
    }

    // Method: Closing Scanner
    public static void closeScanner () {
        scn.close();
    }
}
