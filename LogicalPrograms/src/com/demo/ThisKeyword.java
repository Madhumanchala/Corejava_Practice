package com.demo;

class Demo {
	int num1;
	int num2;
	int result;

	//It is used to refer to the instance variable that is 
	public Demo(int num1, int num2) {
		this.num1 = num1; // current object
		this.num2 = num2;
	}

}

public class ThisKeyword {
	public static void main(String[] args) {
		Demo obj = new Demo(4, 5); // Constructor

		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}
}
