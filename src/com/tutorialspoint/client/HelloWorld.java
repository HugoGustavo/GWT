package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Image image = new Image();
		
		image.setUrl("http://www.tutorialspoint.com/images/gwt-mini.png");
		
		VerticalPanel panel = new VerticalPanel();
		panel.add(image);
		
		RootPanel.get("gwtContainer").add(panel);
	}

}