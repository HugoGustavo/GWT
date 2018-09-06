package com.tutorialspoint.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		VerticalPanel panel = new VerticalPanel();
		final FormPanel form = new FormPanel();
		final FileUpload fileUpload = new FileUpload();
		Label selectLabel = new Label("Select a file: ");
		Button uploadButton = new Button("Upload File: ");
		
		form.setAction("http://www.tutorialspoint.com/gwt/myFormHandler");
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);
		
		panel.add(selectLabel);
		panel.add(fileUpload);
		panel.add(uploadButton);
		uploadButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String filename = fileUpload.getFilename();
				
				if ( filename.length() == 0 ) {
					Window.alert("No File Specified!");
				} else {
					form.submit();
				}
			}
		});
		
		form.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
			public void onSubmitComplete(SubmitCompleteEvent event) {
				Window.alert(event.getResults());
			}
		});
		
		panel.setSpacing(10);

		form.add(panel);
		
		RootPanel.get("gwtContainer").add(form);
	}

}