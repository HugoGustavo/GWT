package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Button redButton = new Button("Red");
		Button greenButton = new Button("Green");
		Button blueButton = new Button("Blue");
		
		redButton.setWidth("100px");
		greenButton.setWidth("100px");
		blueButton.setWidth("100px");
		
		greenButton.addStyleName("gwt-Green-Button");
		blueButton.addStyleName("gwt-Blue-Button");
		
		redButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Red button clicked!");
			}
		});
				
		greenButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Green Button clicked");
			}
		});
		
		blueButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Blue Button clicked");
			}
		});
		
		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);
		panel.add(redButton);
		panel.add(greenButton);
		panel.add(blueButton);
		RootPanel.get("gwtContainer").add(panel);
	}

}