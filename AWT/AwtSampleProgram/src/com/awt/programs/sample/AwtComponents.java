package com.awt.programs.sample;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class AwtComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame=new Frame("Hello AWT World");
		frame.setSize(400,600);
		frame.setLayout(new GridLayout(3,3,5,10));
		frame.setLayout(new FlowLayout());
		
		frame.setVisible(true);
		
		for(int i=1;i<=10;i++)
		{
			Button button=new Button("Button "+i);
			frame.add(button);
		}
		
		
		frame.invalidate(); 
		
		
	}

}
