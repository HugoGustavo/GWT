package com.tutorialspoint.server;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tutorialspoint.client.Message;
import com.tutorialspoint.client.MessageService;

public class MessageServiceImpl extends RemoteServiceServlet implements MessageService {
	private static final long serialVersionUID = 1L;
	
	public Message getMessage(String input) {
		String messageString = "Hello " + input + "!";
		Message message = new Message();
		message.setMessage(messageString);
		return message;
	}

}
