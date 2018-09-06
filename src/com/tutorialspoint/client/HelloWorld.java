package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Label label1 = new Label("This is first GWT Label");
		Label label2 = new Label("This is second GWT Label");
		
		label1.setTitle("Title for first Label");
		label1.addStyleName("gwt-Green-Border");
		label2.setTitle("Title for second Label");
		label2.addStyleName("gwt-Blue-Border");
		
		VerticalPanel panel = new VerticalPanel();
		panel.add(label1);
		panel.add(label2);
		RootPanel.get("gwtContainer").add(panel);
	}

}