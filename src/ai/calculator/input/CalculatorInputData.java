package ai.calculator.input;

import java.io.IOException;

public interface CalculatorInputData {

    String getStringNumber() throws IOException;
    String getOperation() throws IOException;
}
