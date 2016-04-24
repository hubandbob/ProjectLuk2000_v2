package fr.ipst.cnam.managedBeans;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="message")
@RequestScoped
public class Message {
	
	private String message = "Hello world !";

	public String getMessage() {
		System.out.println("Message getMessage : "+ new Date().getTime());
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Message setMessage : "+ new Date().getTime());
		this.message = message;
	}
	
	

}
