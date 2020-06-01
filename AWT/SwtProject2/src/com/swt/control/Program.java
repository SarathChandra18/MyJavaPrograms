package com.swt.control;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		Shell shell = new Shell(display);
		
		shell.setVisible(true);
		
		Button button1 = createButton(shell,0,"Submit Button");
		button1.setBounds(10, 80, 150, 200);
		
		Button button2 = createButton(shell,0,"Quit Button");
		button2.setBounds(200, 80, 250, 180);
		
		
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}

	}
	
	
	static Button createButton(Shell shel,int no,String text)
	{
		Button button = new Button(shel,no);
		button.setText(text);
		return button;
	}

}
