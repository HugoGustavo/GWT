package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RichTextArea richTextArea = new RichTextArea();
		
		richTextArea.setHeight("220");
		richTextArea.setWidth("200");
		
		richTextArea.setHTML("<b>Hello World!<b><br/><br/>" +
		"<i> Be Happy!</i><br/></br><u>Stay Cool!</u>");
		
		VerticalPanel panel = new VerticalPanel();
		panel.add(richTextArea);
		RootPanel.get("gwtContainer").add(panel);
	}

}