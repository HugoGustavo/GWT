package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Button Btn1 = new Button("Big Text");
		Btn1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RootPanel.get("myText").setStyleName("gwt-Big-Text");
			}
		});
		
		Button Btn2 = new Button("Small Text");
		Btn2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RootPanel.get("myText").setStyleName("gwt-Small-Text");
			}
		});
		
		RootPanel.get("gwtGreenButton").add(Btn1);
		RootPanel.get("gwtRedButton").add(Btn2);
	}

}