
package com.demo;
class Calc
{
	int num1;
	int num2;
	int result;
	
	public Calc()
	{
		num1 = 5;
		num2 = 5;
		System.out.println("in constructor");
	}
	public Calc(int n)
	{
		num1 = n;
		num2 = n;
	}
	public Calc(double d,int n)
	{
		num1 = (int) d;
		num2 = n;
	}
	
}

public class ConstructorDemo 
{
	public static void main(String[] args)
	{
		Calc obj = new Calc(); //Constructor
		
		System.out.println(obj.num1);

	}
}