import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionListener;

public class CalculationView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    CalculationView(){
        JPanel calcPanel = new JPanel();
        String title = "Tema 1 MDS - Calculator";
        Border border = BorderFactory.createTitledBorder(title);
        calcPanel.setBorder(border);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);

    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getsecondtNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public int getcalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }

    void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }


    void addCalculationListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMesage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
