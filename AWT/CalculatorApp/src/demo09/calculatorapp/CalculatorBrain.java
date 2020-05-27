package demo09.calculatorapp;

import java.awt.event.ActionEvent;

import demo09.calculatorapp.models.CalculatorDigitClickListener;
import demo09.calculatorapp.models.CalculatorOperatorClickListner;
import demo09.calculatorapp.models.DisplayChangeListener;

public class CalculatorBrain implements CalculatorDigitClickListener, CalculatorOperatorClickListner {

	String operatr;
	String digit;
	String digit2;
	String operation = "";
	String totalValue;

	DisplayChangeListener displayChangeListner;

	public DisplayChangeListener getDisplayChangeListner() {
		return displayChangeListner;
	}

	public void setDisplayChangeListner(DisplayChangeListener displayChangeListner) {
		this.displayChangeListner = displayChangeListner;
	}

	// double first; // first value

	// double second; // a second value is added to the result

	// boolean isFirst = true;
	// boolean isDecimalAdded = false; // decimal has not been added

//	public double getValue() {
//		if (isFirst)
//			return first;
//		else
//			return second;
//	}
//
//	public void setValue(double value) {
//		if (isFirst)
//			first = value;
//		else
//			second = value;
//	}

	@Override
	public void digitClicked(String digit) {
		// TODO Auto-generated method stub
		// System.out.println("Recieved :"+digit);
		if (displayChangeListner != null)
			if (this.digit == null) {
				this.digit = digit;
			} else {
				this.digit2 = digit;
			}
		// displayChangeListner.updateDisplay("digit:"+digit);
		// displayChangeListner.updateDisplay(digit);
		operation = operation + digit;
		displayChangeListner.updateDisplay(operation);

		caluclateOperation(digit);

	}

	@Override
	public void operatorClicked(String operator) {
		// TODO Auto-generated method stub
		// System.out.println("Received operator:"+operator);
		if (displayChangeListner != null)
			if (!operator.equals("=")) {
				this.operatr = operator;
				// displayChangeListner.updateDisplay("operator:"+operator);
				operation = operation + operator;
				displayChangeListner.updateDisplay(operation);
			}
			// displayChangeListner.updateDisplay(operator);
			else {
				caluclateOperation(operator);
			}
	}

	public void caluclateOperation(String operator) {
		if (operator.equals("=")) {
			if (operatr.equals("+")) {
				totalValue = String.valueOf(Integer.parseInt(digit) + Integer.parseInt(digit2));

				displayChangeListner.updateDisplay(totalValue);
				digit = String.valueOf(Integer.parseInt(digit) + Integer.parseInt(digit2));

			}

			if (operatr.equals("-")) {
				totalValue = String.valueOf(Integer.parseInt(digit) - Integer.parseInt(digit2));
				displayChangeListner.updateDisplay(totalValue);
				digit = String.valueOf(Integer.parseInt(digit) - Integer.parseInt(digit2));

			}
			if (operatr.equals("*")) {
				totalValue = String.valueOf(Integer.parseInt(digit) * Integer.parseInt(digit2));
				displayChangeListner.updateDisplay(totalValue);
				digit = String.valueOf(Integer.parseInt(digit) * Integer.parseInt(digit2));

			}

			if (operatr.equals("%")) {
				totalValue = String.valueOf(Integer.parseInt(digit) % Integer.parseInt(digit2));
				displayChangeListner.updateDisplay(totalValue);
				digit = String.valueOf(Integer.parseInt(digit) % Integer.parseInt(digit2));

				System.out.println(totalValue);
			}

			if (operatr.equals("/")) {
				if (Integer.parseInt(digit2) != 0) {
					totalValue = String.valueOf(Integer.parseInt(digit) / Integer.parseInt(digit2));
					displayChangeListner.updateDisplay(totalValue);
					digit = String.valueOf(Integer.parseInt(digit) / Integer.parseInt(digit2));

				} else {
					displayChangeListner.updateDisplay("infinite");
				}
			}

		}

	}

}
