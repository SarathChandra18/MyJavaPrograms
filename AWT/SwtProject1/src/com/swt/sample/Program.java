package com.swt.sample;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		
		
		
		
		
		Shell shell = new Shell(display);
		shell.setVisible(true);
		shell.setText("hello swt world");
		shell.setSize(300, 300);
		
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
	}

}
