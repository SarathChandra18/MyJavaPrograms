package com.swtprograms.calculator;

import in.conceptarchitect.swt.Application;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application
		.instance
		.setTitle("Mixed Layout Demo"
				+ "")
		.build(new AppUiBuilder())
		.run();
	}

}
