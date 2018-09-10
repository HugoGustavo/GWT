package com.tutorialspoint.client;


import java.util.Arrays;
import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionModel;
import com.google.gwt.view.client.SingleSelectionModel;


public class HelloWorld implements EntryPoint {

	private static class Contact {
		private static int nextId = 0;
		private final int id;
		private String name;
		
		public Contact(String name) {
			nextId++;
			this.id = nextId;
			this.name = name;
		}
	}
	
	private static class ContactCell extends AbstractCell<Contact>{
		@Override
		public void render(Context context, Contact value, SafeHtmlBuilder sb) {
			if ( value != null )
				sb.appendEscaped(value.name);	
		}
	}
	
	private static final List<Contact> CONTACTS = Arrays.asList(new Contact("John"), new Contact("Joe"), new Contact("Michael"), new Contact("Sarah"), new Contact("George"));
	@Override
	public void onModuleLoad() {
		ProvidesKey<Contact> keyProvider = new ProvidesKey<Contact>() {
			public Object getKey(Contact item) {
				return (item == null) ? null : item.id;
			}
		};
		
		CellList<Contact> cellList = new CellList<Contact>(new ContactCell(),keyProvider);
		
		cellList.setRowCount(CONTACTS.size(), true);
		cellList.setRowData(0, CONTACTS);
		
		SelectionModel<Contact> selectionModel = new SingleSelectionModel<Contact>(keyProvider);
		cellList.setSelectionModel(selectionModel);
		
		Contact sarah = CONTACTS.get(3);
		selectionModel.setSelected(sarah, true);
		
		sarah.name = "Sara";
		
		cellList.redraw();
		
		VerticalPanel panel = new VerticalPanel();
		panel.setBorderWidth(1);
		panel.setWidth("200");
		panel.add(cellList);
		
		RootPanel.get().add(panel);
		
		
	}

}