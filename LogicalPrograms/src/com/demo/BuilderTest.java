package com.demo;

public class BuilderTest {
	
	public static void main(String args[])
	{
		String request;
		StringBuffer buffer=new StringBuffer();
		System.out.println("Before  affend "+buffer);

		buffer.append("JAVA");
		
		StringBuilder builder =new StringBuilder();
		
		request=buffer.toString();
		
		System.out.println("-----"+request);
		
		System.out.println("RESPONSE :"+buffer.toString());
		
		System.out.println("After affend : "+ buffer);
		
	}

}
