package demo09.calculatorapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import in.conceptarchitect.ui.Window;


public class Calculator {

	
	Window calculatorWindow;
	DisplayPanel displayPanel;
	DigitPanel digitPanel;
	OperatorPanel operatorPanel;
	CalculatorBrain calculatorBrain;
	ClearPannel clearPanel;
	
	
	
	public Calculator(String title) {
		// TODO Auto-generated constructor stub
		
		buildUi(title);
	}
	
	

	private void buildUi(String title) {
		// TODO Auto-generated method stub
		calculatorWindow=new Window(title);
		calculatorWindow.setLayout(new BorderLayout());

		
		calculatorBrain=new CalculatorBrain();
		
		
		displayPanel=new DisplayPanel();
		//calculatorWindow.add(displayPanel,BorderLayout.NORTH);
		calculatorBrain.setDisplayChangeListner(displayPanel);

		clearPanel = new ClearPannel();
		
		Panel northPanel = new Panel();
		northPanel.setLayout(new GridLayout(2, 1));
		northPanel.add(displayPanel);
		northPanel.add(clearPanel);
		calculatorWindow.add(northPanel,BorderLayout.NORTH);
		
		//calculatorWindow.add(displayPanel,BorderLayout.NORTH);
		//calculatorWindow.add(clearPanel,BorderLayout.NORTH);
		clearPanel.setCalculatorClearClickListener(calculatorBrain);
		
		
		digitPanel=new DigitPanel();
		digitPanel.setDigitClickListner(calculatorBrain); //inform calculator brain that digit is clicked
		calculatorWindow.add(digitPanel,BorderLayout.CENTER);
		
		operatorPanel=new OperatorPanel();
		operatorPanel.setOperatorListner(calculatorBrain); //inform calculator brain that operator is clicked
		calculatorWindow.add(operatorPanel,BorderLayout.EAST);
		
		  //display panel will recieve display changes
		
		
	}

	public void start() {
		// TODO Auto-generated method stub
		calculatorWindow.setSize(450,450);
		calculatorWindow.setVisible(true);
	}

}
