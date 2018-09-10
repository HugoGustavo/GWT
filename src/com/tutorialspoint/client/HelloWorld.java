package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;


public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		final DeckPanel deckPanel = new DeckPanel();
		deckPanel.setSize("300px", "120px");
		deckPanel.setStyleName("deckpanel");
		
		Label label1 = new Label("This is first Page");
		Label label2 = new Label("This is second Page");
		Label label3 = new Label("This is third Page");
		
		deckPanel.add(label1);
		deckPanel.add(label2);
		deckPanel.add(label3);
		
		deckPanel.showWidget(0);
		
		HorizontalPanel buttonBar = new HorizontalPanel();
		buttonBar.setSpacing(5);
		
		Button button1 = new Button("Page 1");
		button1.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				deckPanel.showWidget(0);;
			}
		});
		
		Button button2 = new Button("Page 2");
		button2.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				deckPanel.showWidget(1);;
			}
		});
		
		Button button3 = new Button("Page 3");
		button3.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				deckPanel.showWidget(2);
			}
		});
		
		buttonBar.add(button1);
		buttonBar.add(button2);
		buttonBar.add(button3);
		
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.add(deckPanel);
		vPanel.add(buttonBar);
		
		RootPanel.get("gwtContainer").add(vPanel);
		
	}

}