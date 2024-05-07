package com.java.lambda.demo;

@FunctionalInterface
public interface MyFunctionalInterface {

	void m1();

	default void m2() {
		System.out.println("Default method");
	}

	static void m3() {
		System.out.println("Static Method");
	}

}
