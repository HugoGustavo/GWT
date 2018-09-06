package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
		oracle.add("A");
		oracle.add("AB");
		oracle.add("ABC");
		oracle.add("ABCD");
		oracle.add("B");
		oracle.add("BC");
		oracle.add("BCD");
		oracle.add("BCDE");
		oracle.add("C");
		oracle.add("CD");
		oracle.add("CDE");
		oracle.add("CDEF");
		oracle.add("D");
		oracle.add("DE");
		oracle.add("DEF");
		oracle.add("DEFG");
		
		SuggestBox suggestionBox = new SuggestBox(oracle);
		
		suggestionBox.setWidth("200");
		
		VerticalPanel panel= new VerticalPanel();
		
		panel.add(suggestionBox);
		
		RootPanel.get("gwtContainer").add(panel);
		
		
	}

}