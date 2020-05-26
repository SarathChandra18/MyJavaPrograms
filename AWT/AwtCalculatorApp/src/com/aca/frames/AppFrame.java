package com.aca.frames;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

import com.aca.handlers.CalculationsHandler;
import com.aca.handlers.ExitCalcHandler;

public class AppFrame extends Frame{

	public AppFrame() {
		
		createUI();
	}
	
	TextField calculationTextField;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bDiv,bMul,bAddOrSub,bDot,bEqual,exit,clear;
	CalculationsHandler calculationsHandler;
	ExitCalcHandler exitCalcHandler;
	
	private void createUI()
	{
		setTitle("Calculator");
		calculationTextField = new TextField(30);
		setLayout(new GridLayout(5,3,05,10));
	
	    calculationsHandler = new CalculationsHandler(calculationTextField);

		exitCalcHandler = new ExitCalcHandler();
		
		b0 = new Button("0");
		b0.setSize(30, 40);
		b0.addActionListener(calculationsHandler);
		b1 = new Button("1");
		b1.addActionListener(calculationsHandler);

		b2 = new Button("2");
		b2.addActionListener(calculationsHandler);

		b3 = new Button("3");
		b3.addActionListener(calculationsHandler);

		b4 = new Button("4");
		b4.addActionListener(calculationsHandler);

		b5 = new Button("5");
		b5.addActionListener(calculationsHandler);

		b6 = new Button("6");
		b6.addActionListener(calculationsHandler);

		b7 = new Button("7");
		b7.addActionListener(calculationsHandler);

		b8 = new Button("8");
		b8.addActionListener(calculationsHandler);

		b9 = new Button("9");
		b9.addActionListener(calculationsHandler);

		bMul = new Button("*");
		bMul.addActionListener(calculationsHandler);

		bAdd = new Button("+");
		bAdd.addActionListener(calculationsHandler);

		bDiv = new Button("%");
		bDiv.addActionListener(calculationsHandler);

		bSub = new Button("-");
		bSub.addActionListener(calculationsHandler);

		bAddOrSub = new Button("/");
		bAddOrSub.addActionListener(calculationsHandler);

		bDot = new Button(".");
		bDot.addActionListener(calculationsHandler);

		bEqual = new Button("=");
		bEqual.addActionListener(calculationsHandler);
        
        exit = new Button("Exit");
		exit.addActionListener(exitCalcHandler);
		clear = new Button("Clear");
		clear.addActionListener(calculationsHandler);

        this.add(calculationTextField);
        this.add(exit);
		this.add(clear);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(bDiv);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(bMul);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(bSub);
		this.add(bAddOrSub);
		this.add(b0);
		this.add(bDot);
		this.add(bAdd);
		this.add(bEqual);
	}
}
