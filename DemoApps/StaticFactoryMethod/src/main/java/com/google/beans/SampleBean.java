package com.google.beans;

public class SampleBean {
	
	public SampleBean()
	{
		
	}
	public static SampleBean getSampleBean()
	{
		System.out.println("StaticFactory Object has been Created");
		return new SampleBean();
	}
 	
	public void getInfo()
	{
		System.out.println("From SampleBean");
	}
	
	

}
