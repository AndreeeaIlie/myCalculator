package ai.calculator.validator.exceptions;

public class NotAcceptedOperationException extends Exception {
    public void printException() {
        System.out.println("The input operation is not accepted . Please enter \"+\", \"-\" , \"*\" or \"/\" !");
    }
}
