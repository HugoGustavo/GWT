package com.tutorialspoint.client;


import java.util.Date;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;


public class HelloWorld implements EntryPoint {

	
	@Override
	public void onModuleLoad() {
		DatePicker datePicker = new DatePicker();
		final Label text = new Label();
		
		datePicker.addValueChangeHandler(new ValueChangeHandler<Date>() {
			@Override
			public void onValueChange(ValueChangeEvent<Date> event) {
				Date date = event.getValue();
				String dateString = DateTimeFormat.getFormat("MM/dd/yyyy").format(date);
				text.setText(dateString);
			}
		});
		
		datePicker.setValue(new Date(), true);
		
		DateTimeFormat dateFormat = DateTimeFormat.getFormat("MM/dd/yyyy");
		DateBox dateBox = new DateBox();
		dateBox.setFormat(new DateBox.DefaultFormat(dateFormat));
		
		Label selectLabel = new Label("Permanent DatePicker: ");
		Label selectLabel2 = new Label("DateBox with popup DatePicker: ");
		
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setSpacing(10);
		vPanel.add(selectLabel);
		vPanel.add(text);
		vPanel.add(datePicker);
		vPanel.add(selectLabel2);
		vPanel.add(dateBox);
		
		RootPanel.get("gwtContainer").add(vPanel);
	}

}