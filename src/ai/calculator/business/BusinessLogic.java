package ai.calculator.business;

public class BusinessLogic implements Business{
    double result;
    public double returnResult (double firstNumber,double secondNumber, String validOperation) {

        switch (validOperation) {
            case "+" :
                result = firstNumber + secondNumber;
                break;
            case "-" :
                result = firstNumber - secondNumber;
                break;
            case "*" :
                result = firstNumber * secondNumber;
                break;
            case "/" :
                result = firstNumber / secondNumber;
                break;
            default:
                break;
        }
        return result;

    }
}
