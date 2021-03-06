package com.tutorialspoint.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.tutorialspoint.shared.FieldVerifier;

public class HelloWorldTest extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.tutorialspoint.HelloWorldJUnit";
	}
	
	public void testFieldVerifier() {
		assertFalse(FieldVerifier.isValidName(null));
		assertFalse(FieldVerifier.isValidName(""));
		assertFalse(FieldVerifier.isValidName("a"));
		assertFalse(FieldVerifier.isValidName("ab"));
		assertFalse(FieldVerifier.isValidName("abc"));
		assertFalse(FieldVerifier.isValidName("abcd"));
	}
	
	public void testGreetingService() {
		GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
		ServiceDefTarget target = (ServiceDefTarget) greetingService;
		target.setServiceEntryPoint(GWT.getModuleBaseURL() + "helloworld/greet");
		
		delayTestFinish(10000);
		
		greetingService.greetServer("GWT User", new AsyncCallback<String>() {
			public void onFailure(Throwable caught) {
				fail("Request failure: " + caught.getMessage());
			}

			@Override
			public void onSuccess(String result) {
				assertTrue(result.startsWith("Hello, GWT User!"));
				finishTest();
			}
		});
	}
	
	public void testGetGreeting() {
		HelloWorld helloWorld = new HelloWorld();
		String name = "Robert";
		String expectedGreeting = "Hello " + name + "!";
		assertEquals(expectedGreeting, helloWorld.getGreeting(name));
	}
	

}
