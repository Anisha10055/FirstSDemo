package com.cg.learn;

public class HelloImpl implements Hello{
	private String greeting;
	public HelloImpl()
	{
	System.out.println("constructor called..");
	}

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name+"\n"+greeting;
	}

	public HelloImpl(String greeting) {
		super();
		System.out.println("agr constructor called..");
		this.greeting = greeting;
	}

}
