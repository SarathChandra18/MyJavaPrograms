package jface.fontsandcolors;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class Jfacecolorsandfonts {

	protected Shell shell;
	private Text txtEnteRyourName;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Jfacecolorsandfonts window = new Jfacecolorsandfonts();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnSarath = new Button(shell, SWT.NONE);
		btnSarath.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSarath.setBounds(10, 71, 75, 25);
		btnSarath.setText("sarath");
		
		txtEnteRyourName = new Text(shell, SWT.BORDER);
		txtEnteRyourName.setText("ente ryour name");
		txtEnteRyourName.setBounds(61, 162, 76, 21);

	}
}
