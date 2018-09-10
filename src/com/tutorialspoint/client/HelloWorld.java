package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class HelloWorld implements EntryPoint {

	private class MyClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			Window.alert("Hello World!");
			
		}
	}
	
	private class MyKeyDownHandler implements KeyDownHandler{
		@Override
		public void onKeyDown(KeyDownEvent event) {
			if ( event.getNativeKeyCode() == KeyCodes.KEY_ENTER ) {
				Window.alert(((TextBox) event.getSource()).getValue());
			}
		}
	}
	@Override
	public void onModuleLoad() {
		TextBox textBox = new TextBox();
		textBox.addKeyDownHandler(new MyKeyDownHandler());
		
		Button button = new Button("Click Me!");
		button.addClickHandler(new MyClickHandler());
		
		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);
		panel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		panel.setSize("300", "100");
		panel.add(textBox);
		panel.add(button);
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.add(panel);
		RootPanel.get("gwtContainer").add(decoratorPanel);
	}

}