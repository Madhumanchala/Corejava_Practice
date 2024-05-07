package com.demo;

import java.util.Scanner;

public class EmailValidation {

	public boolean checkEmail(String email) {

		int length = email.length();

		for (int i = 0; i < length; i++) {

			if (email.charAt(i) == '@') {
				String domain = email.substring(i, length);

				if (domain.equals("@gmail.com") || domain.equals("@yahoo.com")) {
					System.out.println("valid email is " + email);
					return true;
				} else {

					System.out.println(email + " email is invalid");

					return false;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("enter ");
		Scanner sc=new Scanner(System.in);
		String Email=sc.next();

		EmailValidation emailvalidation=new EmailValidation();

		emailvalidation.checkEmail(Email);
	}
}
