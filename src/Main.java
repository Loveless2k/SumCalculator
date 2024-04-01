public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(100);
        simpleCalculator.setSecondNumber(50);

        System.out.println("Sum between " + simpleCalculator.getFirstNumber() + " and " + simpleCalculator.getSecondNumber()
        + " = " + simpleCalculator.getAdditionResult());

        System.out.println("Substraction between " + simpleCalculator.getSecondNumber() + " and " + simpleCalculator.getFirstNumber()
        + " = " + simpleCalculator.getSubstractionResult());

        System.out.println("Multiplication between " + simpleCalculator.getFirstNumber() + " and " + simpleCalculator.getSecondNumber()
                + " = " + simpleCalculator.getMultiplicationResult());

        System.out.println("Division between " + simpleCalculator.getFirstNumber() + " and " + simpleCalculator.getSecondNumber()
                + " = " + simpleCalculator.getDivisionResult());
    }
}
