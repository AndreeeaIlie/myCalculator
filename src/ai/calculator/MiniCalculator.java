package ai.calculator;

import ai.calculator.business.Business;
import ai.calculator.business.BusinessLogic;
import ai.calculator.input.CalculatorInputData;
import ai.calculator.input.ConsoleInputNumber;
import ai.calculator.input.FileInputNumber;
import ai.calculator.output.OutputConsole;
import ai.calculator.output.OutputFile;
import ai.calculator.output.OutputInterface;
import ai.calculator.validator.DataValidation;
import ai.calculator.validator.Validator;
import ai.calculator.validator.exceptions.NotAcceptedOperationException;
import ai.calculator.validator.exceptions.NotNumberException;

import java.io.IOException;

public class MiniCalculator {
    public static void main(String[] args) {
//        CalculatorInputData calculatorInputData = new ArgsInputNumber(args);
        CalculatorInputData calculatorInputData = new ConsoleInputNumber();
        String firstStringNumber = null;
        String operation = null;
        String secondStringNumber = null;
        try {
            firstStringNumber = calculatorInputData.getStringNumber();
            operation = calculatorInputData.getOperation();
            secondStringNumber = calculatorInputData.getStringNumber();
        } catch (IOException e) {
            System.out.println("Exception occured: ");
            e.printStackTrace();
        }

        Validator validator = new DataValidation();
        double firstNumber = 0;
        try {
            firstNumber = validator.validateNumber(firstStringNumber);
        } catch (NotNumberException nne) {
            nne.printException();
            System.exit(0);
        }

        String validOperation = null;
        try {
            validOperation = validator.validateOperation(operation);
        } catch (NotAcceptedOperationException naoe) {
            naoe.printException();
            System.exit(0);
        }

        double secondNumber = 0;
        try {
            secondNumber = validator.validateNumber(secondStringNumber);
        } catch (NotNumberException nne) {
            nne.printException();
            System.exit(0);
        }

        Business business = new BusinessLogic();
        double outputResult = business.returnResult(firstNumber, secondNumber, validOperation);
        
        OutputInterface outputFile = new OutputFile();
        try {
            outputFile.outputResult(outputResult);
        } catch (IOException e) {
            System.out.println("Exception occurred: ");
            e.printStackTrace();
        }
    }
}
