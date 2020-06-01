package demo09.calculatorapp;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import demo09.calculatorapp.models.CalculatorClearClickListener;

public class ClearPannel extends Panel implements ActionListener{

	CalculatorClearClickListener calculatorClearClickListener;
	
	public ClearPannel() {
	
		this.setLayout(new GridLayout(1, 3));

		String[] values = { "C","AC","<=" };

		for (String value : values) {
			Button button = new Button(value);
			this.add(button);
			button.addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button button=(Button) e.getSource();		
		String value=button.getLabel();		
		
		calculatorClearClickListener.buttonClicked(value);  //inform the brain about button clicked
	}

	public CalculatorClearClickListener getCalculatorClearClickListener() {
		return calculatorClearClickListener;
	}

	public void setCalculatorClearClickListener(CalculatorClearClickListener calculatorClearClickListener) {
		this.calculatorClearClickListener = calculatorClearClickListener;
	}

	
	
}
