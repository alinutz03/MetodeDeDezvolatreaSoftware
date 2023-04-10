import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculationView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculationView theView, CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;


        this.theView.addCalculationListener(new CalculateListener());
    }


    class CalculateListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0){
            int firstNumber, secondNumber = 0;
            try {
                firstNumber= theView.getFirstNumber();
                secondNumber=theView.getsecondtNumber();

                theModel.addTwoNumber(firstNumber,secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                theView.displayErrorMesage("You need to enter 2 integers");
            }
        }
    }
}
