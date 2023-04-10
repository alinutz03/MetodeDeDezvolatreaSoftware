public class MVCCalculator {
    public static void main(String[] args) {
        CalculationView theView = new CalculationView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }
}
