package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;


public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		final TabPanel tabPanel = new TabPanel();
		
		HTML firstPage = new HTML("<h1>We are on first Page.</h1>");
		HTML secondPage = new HTML("<h1>We are on second Page.</h1>");
		HTML thirdPage = new HTML("<h1>We are on third Page.</h1>");
		
		String firstPageTitle = "First Page";
		String secondPageTitle = "Second Page";
		String thirdPageTitle = "Third Page";
		
		tabPanel.setWidth("400");
		
		tabPanel.add(firstPage, firstPageTitle);
		tabPanel.add(secondPage, secondPageTitle);
		tabPanel.add(thirdPage, thirdPageTitle);
		
		tabPanel.addSelectionHandler(new SelectionHandler<Integer>() {
			@Override
			public void onSelection(SelectionEvent<Integer> event) {
				History.newItem("pageIndex: " + event.getSelectedItem());
			}
		});
		
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				String historyToken = event.getValue();
				try {
					if ( historyToken.substring(0,9).equals("pageIndex")) {
						String tabIndexToken = historyToken.substring(9,10);
						int tabIndex = Integer.parseInt(tabIndexToken);
						tabPanel.selectTab(tabIndex);
					} else {
						tabPanel.selectTab(0);
					}
				} catch (IndexOutOfBoundsException e) {
					tabPanel.selectTab(0);
				}
			}
		});
		
		tabPanel.selectTab(0);
		
		RootPanel.get("gwtContainer").add(tabPanel);
		
	}

}