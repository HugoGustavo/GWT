package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.RootPanel;


public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
		horizontalSplitPanel.setSize("300px", "200px");
		horizontalSplitPanel.setSplitPosition("30%");
		
		String randomText = "This is a sample text. ";
		for ( int i = 0; i < 2;  i++) {
			randomText += randomText;
		}
		
		horizontalSplitPanel.setRightWidget(new HTML(randomText));
		horizontalSplitPanel.setLeftWidget(new HTML(randomText));
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.add(horizontalSplitPanel);
		RootPanel.get("gwtContainer").add(decoratorPanel);
	}

}