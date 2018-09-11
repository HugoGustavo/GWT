package com.tutorialspoint.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface LoginResources extends ClientBundle {
	public interface MyCss extends CssResource {
		String blackText();
		String redText();
		String loginButton();
		String box();
		String background();
	}
	
	@Source("Login.css")
	public MyCss style();
}
