package fr.ipst.cnam.managedBeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.ipst.cnam.test.Control;

@ManagedBean(name="helloWorld")
@RequestScoped
public class HelloWorld {
	
	@ManagedProperty(value="#{message}")
	private Message messageBean;
	
	private String message;
	
	public HelloWorld() {
		System.out.println("HelloWorld constructeur : "+ new Date().getTime());
		//message = messageBean.getMessage();
		
	}

	@PostConstruct
	public void init()
	{
		System.out.println("init method");
		Control.main(null);
	}
	
	public String getMessage() {
		System.out.println("HelloWorld getMessage DB : "+ new Date().getTime());
		if(messageBean != null)
		{
			message = messageBean.getMessage();
		}
		System.out.println("HelloWorld getMessage FB : "+ new Date().getTime());
		return message;
		
	}

	public void setMessageBean(Message messageBean) {
		System.out.println("HelloWorld setMessageBean DB : "+ new Date().getTime());
		this.messageBean = messageBean;
		System.out.println("HelloWorld setMessageBean FB : "+ new Date().getTime());
	}

	public Message getMessageBean() {
		System.out.println("HelloWorld getMessageBean DB : "+ new Date().getTime());
		System.out.println("HelloWorld getMessageBean FB : "+ new Date().getTime());
		return messageBean;
		
	}

	
	
	

}
