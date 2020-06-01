package demo09.calculatorapp;

import demo09.calculatorapp.models.CalculatorClearClickListener;
import demo09.calculatorapp.models.CalculatorDigitClickListener;
import demo09.calculatorapp.models.CalculatorOperatorClickListner;
import demo09.calculatorapp.models.DisplayChangeListener;

public class CalculatorBrain implements CalculatorDigitClickListener, CalculatorOperatorClickListner,CalculatorClearClickListener {
	
	DisplayChangeListener displayChangeListner;
	
	
	public DisplayChangeListener getDisplayChangeListner() {
		return displayChangeListner;
	}

	public void setDisplayChangeListner(DisplayChangeListener displayChangeListner) {
		this.displayChangeListner = displayChangeListner;
	}

	//double first; //first value
	
	String first="0";
	
	String second="0";
	//double second; //a second value is added to the result
	
	boolean isFirst=true;
	boolean isDecimalAdded=false; //decimal has not been added
	
	
	public String getValue() {
		if(isFirst)
			return first;
		else
			return second;
	}
	
	public void setValue(String value) {
		if(isFirst)
			first=value;
		else
			second=value;
	}

	

	@Override
	public void digitClicked(String digit) {
		// TODO Auto-generated method stub
		//System.out.println("Recieved :"+digit);
		if(displayChangeListner!=null)
			
			if(digit.contentEquals("."))
			{
				handleDot();
			}
			else if(digit.contentEquals("+/-"))
		    {
		    	handlePlusOrMinus();
		    }
			else 
			{
				handleValue(digit);
			}
			displayChangeListner.updateDisplay(digit);
	}

	private void handleValue(String digit) {
		// TODO Auto-generated method stub
		String value=getValue(); //returns current value first/second
		if(value.contentEquals("0"))
			value=digit;
		else
			value+=digit;
		
		setValue(value); //update the first/second
		updateDisplay();
	}

	private void updateDisplay() {
		// TODO Auto-generated method stub
		if(displayChangeListner!=null)
			displayChangeListner.updateDisplay(getValue());
	}
	
	private void handlePlusOrMinus() {
		// TODO Auto-generated method stub
		String value=getValue();
		if(value.contentEquals("0"))
			return ;
		
		if(value.startsWith("-"))
			value=value.substring(1);  
		else
			value="-"+value;
		
		setValue(value);
		updateDisplay();

	}

	private void handleDot() {
		// TODO Auto-generated method stub
		String value = getValue();
		if(!value.contains("."))
		{
			value+=".";
			setValue(value);
			updateDisplay();
		}
		
		
	}

	@Override
	public void operatorClicked(String operator) {
		// TODO Auto-generated method stub
		//System.out.println("Received operator:"+operator);
		if(displayChangeListner!=null)
			displayChangeListner.updateDisplay("operator:"+operator);
		
	}

	@Override
	public void buttonClicked(String button) {
		// TODO Auto-generated method stub
		if(displayChangeListner!=null)
			if(button.contains("C"))
			{
				setValue("0");
				updateDisplay();

			}
			else if(button.contains("<="))
			{
				String value = getValue();
				if(value.length()==1)
					value="0";
				else
					value = value.substring(0, value.length()-1);
				setValue(value);
				updateDisplay();
			}
	}

	

}
