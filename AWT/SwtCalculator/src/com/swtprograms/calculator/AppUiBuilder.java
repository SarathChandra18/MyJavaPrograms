package com.swtprograms.calculator;

import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import in.conceptarchitect.swt.Application;
import in.conceptarchitect.swt.UIBuilder;

public class AppUiBuilder implements UIBuilder {

	@Override
	public void build(Composite parent) {
		// TODO Auto-generated method stub
		parent.setLayout(new FormLayout());
		Composite stretchPane=new Composite(parent, 0);
		
		
		GridLayout layout=new GridLayout();		
		layout.numColumns=5;
		layout.verticalSpacing=20;
		layout.horizontalSpacing=40;
		//layout.makeColumnsEqualWidth=true;
		stretchPane.setLayout(layout);
		Arrays.asList("7","8","9","4","5","6","1","2","3");
		
		addButtons(stretchPane, 		Arrays.asList("7","8","9","4","5","6","1","2","3")
, "Button");	
	}

	private void addButtons(Composite parentPanel, List l, String nameBase) {
		for(int i=0;i<=l.size()-1;i++) {
			Button button=new Button(parentPanel,SWT.PUSH);
			button.setText(nameBase+l.get(i));
			
			button.addSelectionListener(new SelectionAdapter() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					Button btn=(Button) e.getSource();
					Application.instance.setTitle("Button "+btn.getText()+" clicked");
				}
			});
			
		}
	
	}
	
}
