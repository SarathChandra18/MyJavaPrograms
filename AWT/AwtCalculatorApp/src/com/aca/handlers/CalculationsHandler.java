package com.aca.handlers;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationsHandler implements ActionListener{
	
	private TextField tf;
	
	String s1,s2,s3,s4,s5;
	
	int n;
	
	String operation;
	public CalculationsHandler(TextField nameTextField) {
		// TODO Auto-generated constructor stub
		this.tf = nameTextField;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		if(ae.getActionCommand()=="0")
		{
			s3 = tf.getText();
			s4 = "0";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="1")
		{
			s3 = tf.getText();
			s4 = "1";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="2")
		{
			s3 = tf.getText();
			s4 = "2";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="3")
		{
			s3 = tf.getText();
			s4 = "3";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="4")
		{
			s3 = tf.getText();
			s4 = "4";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="5")
		{
			s3 = tf.getText();
			s4 = "5";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="6")
		{
			s3 = tf.getText();
			s4 = "6";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="7")
		{
			s3 = tf.getText();
			s4 = "7";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="8")
		{
			s3 = tf.getText();
			s4 = "8";
			s5 = s3 + s4;
			tf.setText(s5);
		}
		if(ae.getActionCommand()=="9")
		{
			s3 = tf.getText();
			s4 = "9";
			s5 = s3 + s4;
			tf.setText(s5);
		}

		
		if(ae.getActionCommand()=="+")
		{
			s1= tf.getText();
			tf.setText("");
			operation = "sum";
		}
		
		if(ae.getActionCommand()=="*")
		{
			s1= tf.getText();
			tf.setText("");
			operation = "mul";
		}
		
		if(ae.getActionCommand()=="-")
		{
			s1= tf.getText();
			tf.setText("");
			operation = "sub";
		}
		
		if(ae.getActionCommand()=="%")
		{
			s1= tf.getText();
			tf.setText("");
			operation = "mod";
		}
		
		if(ae.getActionCommand()=="/")
		{
			s1= tf.getText();
			tf.setText("");
			operation = "div";
		}
		
		if(ae.getActionCommand()=="Clear")
		{
			tf.setText("");
		}
		
		if(ae.getActionCommand()=="=")
		{
			s2 = tf.getText();
			if(operation.equals("sum"))
			{
				n = Integer.parseInt(s1) + Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			
			else if(operation.equals("sub"))
			{
				n = Integer.parseInt(s1) - Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			
			else if(operation.equals("mul"))
			{
				n = Integer.parseInt(s1) * Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			
			else if(operation.equals("mod"))
			{
				n = Integer.parseInt(s1) % Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			
			else if(operation.equals("div"))
			{
				if(Integer.parseInt(s2)!=0)
				{
				n = Integer.parseInt(s1) / Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
				}
				else
				{
					tf.setText("infinite");
				}
			}
		}
	}
	

}
