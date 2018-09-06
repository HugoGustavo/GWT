package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		ListBox listBox1 = new ListBox();
		listBox1.addItem("First");
		listBox1.addItem("Second");
		listBox1.addItem("Third");
		listBox1.addItem("Fourth");
		listBox1.addItem("Fifth");
		
		ListBox listBox2 = new ListBox();
		listBox2.addItem("First");
		listBox2.addItem("Second");
		listBox2.addItem("Third");
		listBox2.addItem("Fouth");
		listBox2.addItem("Fifth");
		
		listBox1.setVisibleItemCount(5);
		
		listBox2.setVisibleItemCount(1);
		
		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);
		panel.add(listBox1);
		panel.add(listBox2);
		RootPanel.get("gwtContainer").add(panel);
		
		
	}

}