package ai.calculator.validator.exceptions;

public class NotNumberException extends Exception{

    String inputData;

    public NotNumberException (String inputData) {
        this.inputData = inputData;
    }
    public void printException() {
        System.out.println("Input data \"" + inputData + "\" is not a number. Please enter a number!");
    }
}
