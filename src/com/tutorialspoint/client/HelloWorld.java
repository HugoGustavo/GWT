package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;

public class HelloWorld implements EntryPoint {

	private void showSelectedMenuItem(String menuItemName) {
		Window.alert("Menu item: " + menuItemName + " selected");
	}
	
	@Override
	public void onModuleLoad() {
		MenuBar menu = new MenuBar();
		menu.setAutoOpen(true);
		menu.setWidth("100px");
		menu.setAnimationEnabled(true);
		
		MenuBar fileMenu = new MenuBar(true);
		fileMenu.setAnimationEnabled(true);
		
		fileMenu.addItem("New", new Command() {
			@Override
			public void execute() {
				showSelectedMenuItem("New");
			}
		});
		
		fileMenu.addSeparator();
		fileMenu.addItem("Exit", new Command() {
			@Override
			public void execute() {
				showSelectedMenuItem("Exit")
			}
		});
		
		MenuBar editMenu = new MenuBar(true);
		editMenu.setAnimationEnabled(true);
		
		editMenu.addItem("Undo", new Command() {
			@Override
			public void execute() {
				showSelectedMenuItem("Undo");
			}
		});
		
		editMenu.addItem("Redo", new Command() {
			@Override
			public void execute() {
				showSelectedMenuItem("Redo");
			}
		});
		
		editMenu.addItem("Cut", new Command() {
			@Override
			public void execute() {
				showSelectedMenuItem("Cut");
			}
		});
		
		editMenu.addItem("Copy", new Command() {
			@Override
			public void execute() {
				showSelectedMenuItem("Copy");
			}
		});
		
		editMenu.addItem("Paste", new Command() {
			@Override
			public void execute(){
				showSelectedMenuItem("Paste");
			}
		});
		
		menu.addItem(new MenuItem("File"), fileMenu);
		menu.addSeparator();
		menu.addItem(new MenuItem("Edit"), editMenu);
		
		RootPanel.get("gwtContainer").add(menu);
		
		
	}

}