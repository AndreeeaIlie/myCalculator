package ai.calculator.input;

import java.util.Scanner;

public class ConsoleInputNumber implements CalculatorInputData {
    private String stringNumber;
    private String operation;

    public String getStringNumber() {
        Scanner scanner = new Scanner(System.in);
        this.stringNumber = scanner.nextLine();
        return stringNumber;
    }

    public String getOperation() {
        Scanner scanner = new Scanner(System.in);
        this.operation = scanner.nextLine();
        return operation;
    }
}
