public class SimpleCalculator {
    private double firstNumber, secondNumber;

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubstractionResult(){
        return secondNumber - firstNumber;
    }

    public  double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if (secondNumber == 0.0){
            return 0.0;
        }

        return firstNumber / secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
