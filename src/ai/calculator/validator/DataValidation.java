package ai.calculator.validator;

import ai.calculator.validator.exceptions.NotAcceptedOperationException;
import ai.calculator.validator.exceptions.NotNumberException;

public class DataValidation implements Validator {
    private double validNumber;
    private String validOperation;
    public double validateNumber(String inputData) throws NotNumberException {
        boolean isNumeric = inputData.matches("[0-9]+[\\.]?[0-9]*");
        if(isNumeric) {
            validNumber = Double.parseDouble(inputData);
            return validNumber;
        } else {
            throw new NotNumberException(inputData);
        }
    }
    public String validateOperation(String inputData) throws NotAcceptedOperationException {
        boolean isAccepted = inputData.matches("[+\\-*/]");

        if (isAccepted) {
            this.validOperation = inputData;
            return validOperation;
        } else {
            throw new NotAcceptedOperationException();
        }
    }
}
