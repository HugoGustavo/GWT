package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;


public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		VerticalPanel verticalPanel = new VerticalPanel();
		for ( int i = 1; i <= 10; i++) {
			CheckBox checkBox = new CheckBox("Item " + i);
			verticalPanel.add(checkBox);
		}
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.add(verticalPanel);
		
		RootPanel.get("gwtContainer").add(decoratorPanel);
	}

}