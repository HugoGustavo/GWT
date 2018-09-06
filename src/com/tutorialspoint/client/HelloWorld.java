package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Anchor anchor = new Anchor("TutorialsPoint", false, "http://www.tutorialspoint.com", "_blank");
		VerticalPanel panel = new VerticalPanel();
		panel.add(anchor);
		RootPanel.get("gwtContainer").add(panel);
	}

}