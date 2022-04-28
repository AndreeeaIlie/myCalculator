package ai.calculator.input;

public class ArgsInputNumber implements CalculatorInputData{

    private String[] arrayAgsData;

    private String stringNumber;
    private String operation;
    private int index;

    public ArgsInputNumber(String[] arrayAgsData) {
        this.arrayAgsData = arrayAgsData;
    }

    @Override
    public String getStringNumber() {
        this.stringNumber = arrayAgsData[index];
        index ++;
        return stringNumber;
    }

    @Override
    public String getOperation() {
        this.operation = arrayAgsData[index];
        index++;
        return operation;
    }
}
