package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalSplitPanel;


public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		VerticalSplitPanel verticalSplitPanel = new VerticalSplitPanel();
		verticalSplitPanel.setSize("300px", "200px");
		verticalSplitPanel.setSplitPosition("35%");
		
		String randomText = "This is a sample text. ";
		for ( int i = 0; i < 2; i++) {
			randomText += randomText;
		}
		
		verticalSplitPanel.setBottomWidget(new HTML(randomText));
		verticalSplitPanel.setTopWidget(new HTML(randomText));
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.add(verticalSplitPanel);
		RootPanel.get("gwtContainer").add(decoratorPanel);
	}

}