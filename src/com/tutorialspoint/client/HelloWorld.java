package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;


public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Grid grid = new Grid(2,2);
		
		int numRows = grid.getRowCount();
		int numColumns = grid.getColumnCount();
		
		for ( int row = 0; row < numRows; row++) {
			for ( int col = 0; col < numColumns; col++ ) {
				grid.setWidget(row, col, new Image("http://www.tutorialspoint.com/images/gwt-mini.png"));
			}
		}
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.add(grid);
		RootPanel.get("gwtContainer").add(decoratorPanel);
	}

}