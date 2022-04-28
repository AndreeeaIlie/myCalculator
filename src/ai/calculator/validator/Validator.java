package ai.calculator.validator;

import ai.calculator.validator.exceptions.NotAcceptedOperationException;
import ai.calculator.validator.exceptions.NotNumberException;

public interface Validator {

    public double validateNumber(String inputData) throws NotNumberException;
    public String validateOperation(String inputData) throws NotAcceptedOperationException;
}
