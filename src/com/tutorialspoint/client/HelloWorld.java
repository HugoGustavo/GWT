package com.tutorialspoint.client;


import org.apache.xalan.trace.SelectionEvent;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		final Label labelMessage = new Label();
		labelMessage.setWidth("300");
		
		TreeItem department = new TreeItem();
		department.setText("Departament");
		
		TreeItem salesDepartment = new TreeItem();
		salesDepartment.setText("Sales");
		
		TreeItem marketingDepartment = new TreeItem();
		marketingDepartment.setText("Marketing");
		
		TreeItem manufacturingDepartment = new TreeItem();
		manufacturingDepartment.setText("Manufacturing");
		
		TreeItem employee1 = new TreeItem();
		employee1.setText("Robert");
		
		TreeItem employee2 = new TreeItem();
		employee2.setText("Joe");
		
		TreeItem employee3 = new TreeItem();
		employee3.setText("Chris");
		
		salesDepartment.addItem(employee1);
		salesDepartment.addItem(employee2);
		salesDepartment.addItem(employee3);

		TreeItem employee4 = new TreeItem();
		employee4.setText("Mona");
		TreeItem employee5 = new TreeItem();
		employee5.setText("Tena");
		
		marketingDepartment.addItem(employee4);
		marketingDepartment.addItem(employee5);
		
		TreeItem employee6 = new TreeItem();
		employee6.setText("Rener");
		
		TreeItem employee7 = new TreeItem();
		employee7.setText("Linda");
		
		manufacturingDepartment.addItem(employee6);
		manufacturingDepartment.addItem(employee7);

		department.addItem(salesDepartment);
		department.addItem(marketingDepartment);
		department.addItem(manufacturingDepartment);
		
		Tree tree = new Tree();
		
		tree.addItem(department);
		tree.addSelectionHandler(new SelectionHandler<TreeItem>	() {
			@Override
			public void onSelection(com.google.gwt.event.logical.shared.SelectionEvent<TreeItem> event) {
				labelMessage.setText("Selected Value: " + event.getSelectedItem().getText());
				
			}
		});
		
		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);
		panel.add(tree);
		panel.add(labelMessage);
		
		RootPanel.get("gwtContainer").add(panel);
	
	}

}