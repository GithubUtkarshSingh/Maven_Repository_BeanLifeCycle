package com.nt.Beans;

public class VoterEligibility
{
	 private String  name;
	private int age;
	private String Addr;
	public VoterEligibility()
	{
		System.out.println("Voter Eligibility Cheak");
	}
	public void setName(String name) 
	{
		System.out.println("VoterEligibilityCheak.setNme()");
		this.name = name;
	}
	public void setAge(int age)
	{
		System.out.println("VoterEligibilityCheak.setAge()");
		this.age = age;
	}
	public void setAddr(String addr)
	{
		System.out.println("VoterEligibilityCheak.setAddr()");
		System.out.println("");
		Addr = addr;
	}
	public void myInit()
	{
		System.out.println("VoterEligibilityCheak.myInit()");
		if(age<=0||name==null)throw new IllegalArgumentException("invalid name,age values");
	}
	public String VoterEligibilityCheak()
	{
		System.out.println("VoterEligibility Test");
		if(age<18)
			return "Mr/Miss."+name+" u r not elgible for voting";
		else
			return "Mr/Miss."+name+" u r elgible for voting";
	}
		public void myDestroy1()
		{
			System.out.println("VoterEligibilityCheak.myDestroy1()");
			name=null;
			age=0;
			Addr=null;
		}
	}