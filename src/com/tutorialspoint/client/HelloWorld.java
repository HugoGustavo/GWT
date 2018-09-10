package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;


public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		
		for (int i = 1;  i<= 10; i++) {
			CheckBox checkBox = new CheckBox("Item " + i);
			horizontalPanel.add(checkBox);
		}
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.setWidth("500");
		decoratorPanel.add(horizontalPanel);
		
		RootPanel.get("gwtContainer").add(decoratorPanel);
	}

}