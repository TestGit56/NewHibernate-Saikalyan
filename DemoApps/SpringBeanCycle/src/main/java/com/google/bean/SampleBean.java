package com.google.bean;

public class SampleBean {
	
	private String message = null;

	public SampleBean() {
		System.out.println("\n\n instantiation object creation and setter Injection");
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init()
	{
		System.out.println("\n\n Intialization phase ");
	}
  
	public void service()
	{
		System.out.println("\n\n Servicing method "+message);
	}
	
	public void destroy()
	{
		System.out.println("\n\n resourceDeallocation can be done");
	}
	
	public void display()
	{
		System.out.println("\n\n SpringlifecycleBean ");
	}

}
