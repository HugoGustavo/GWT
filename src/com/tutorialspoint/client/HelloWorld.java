package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		HTML html1 = new HTML("This is first GWT HTML widget usign <b> tag of html </b>");
		HTML html2 = new HTML("This is second GWT HTML widget usign <i> tag of html </i>");
		
		html1.addStyleName("gwt-Green-Border");
		html2.addStyleName("gwt-Blue-Border");
		
		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);
		panel.add(html1);
		panel.add(html2);
		
		RootPanel.get("gwtContainer").add(panel);
	}

}