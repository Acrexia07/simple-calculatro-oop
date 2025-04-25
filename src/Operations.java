public class Operations extends DisplayResult{

    // Initialization: Variable Declaration
    private double num1;
    private double num2;
    private double result;
    private String operationName;

    // Constructor
    Operations (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method: Setter - num1
    public void setNum1 (double num1) {
        this.num1 = num1;
    }

    // Method: Setter - num2
    public void setNum2 (double num2) {
        this.num2 = num2;
    }

    // Method: Getter - num2 (to be used for division)
    public double getNum2 () {
        return num2;
    }

    // Method: Operation - Addition
    public void add () {
        operationName = "sum";
        this.result = num1 + num2;
    }

    // Method: Operation - Multiply
    public void subtract () {
        operationName = "difference";
        this.result = num1 - num2;
    }

    // Method: Operation - Multiply
    public void multiply () {
        operationName = "product";
        this.result = num1 * num2;
    }

    // Method: Operation - Multiply
    public void divide () {
        operationName = "quotient";
        this.result = num1 / num2;
    }

    // Method: Override abstract method from parent (Display result)
    @Override
    void displayResult() {
        System.out.printf("The %s of %.1f and %.1f is %.2f\n", operationName, num1, num2, result);
    }
}
