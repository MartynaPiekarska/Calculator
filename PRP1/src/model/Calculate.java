package model;

public class Calculate implements Calc {

	@Override
    public double calculate(double firstNumber, double secondNumber, String sign) {
    	switch (sign) {
    	case "+":
    		return firstNumber + secondNumber;
    	case "-":
    		return firstNumber - secondNumber;
    	case "x":
    		return firstNumber * secondNumber;
    	case "÷":
    		if(secondNumber == 0)
    			return 0;
    		return firstNumber / secondNumber;
    		
    	default:
    			return 0;
    	}
    }
}
