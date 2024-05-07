package com.java.lambda.demo;

interface Calculator {
	void SwitchOn();

}

public class CalculatorImpl {

	public static void mian(String[] args) {

		Calculator calculator = () -> {
			System.out.println("Switch on");
		};
		calculator.SwitchOn();

	}
}
