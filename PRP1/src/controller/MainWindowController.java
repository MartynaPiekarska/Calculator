package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Calc;
import model.Calculate;

public class MainWindowController  {

	@FXML
	private Label result;
	private double firstNumber = 0;
    private double secondNumber = 0;
    private String sign = "";
    private boolean start = true;
    
	private Calc calculate = new Calculate();
	
    public void setCalc(Calc calculate) {
    	this.calculate = calculate;
    }
    
    @FXML
    public void processNumbers(ActionEvent event) {
	   if(start) {
		   result.setText("");
		   start = false;
	   }
	   String value = ((Button)event.getSource()).getText();
	   result.setText(result.getText() + value);
   }
    
    
    @FXML
    public void processOperators(ActionEvent event) {
	   String value = ((Button)event.getSource()).getText();
	   
	   if (!value.equals("=")) {
		   if(!sign.isEmpty())
			   return;
		   sign = value;
		   firstNumber = Double.parseDouble(result.getText());
		   result.setText("");
	   }else {
		   if(sign.isEmpty())
			   return;
		   secondNumber = Double.parseDouble(result.getText());
		   double output = calculate.calculate(firstNumber, secondNumber, sign);
		   result.setText(String.valueOf(output));
		   sign = "";
		   start = true;
	   }
   }
    
    
    @FXML
    public void ac() {
    	result.setText("");
    }
    
    @FXML
    public void percent() {
    	System.out.println("% nieaktywny");
    }
    
    @FXML
    public void changeSign() {
    	System.out.println("± nieaktywny");
    }

    
}
