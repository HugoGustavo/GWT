package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		PasswordTextBox passwordTextBox1 = new PasswordTextBox();
		PasswordTextBox passwordTextBox2 = new PasswordTextBox();
		
		passwordTextBox2.setText("hello@W@rld");
		
		passwordTextBox2.setReadOnly(true);
		
		VerticalPanel panel = new VerticalPanel();
		
		panel.setSpacing(10);
		panel.add(passwordTextBox1);
		panel.add(passwordTextBox2);

		
		RootPanel.get("gwtContainer").add(panel);
	}

}