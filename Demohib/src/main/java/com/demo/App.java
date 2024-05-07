package com.demo;

import java.lang.module.Configuration;

import com.demo.Alien;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		Alien telusko = new Alien();
		telusko.setAid(101);
		telusko.setAname("MADHU");
		telusko.setColor("blue");
		
		org.hibernate.cfg.Configuration con = new org.hibernate.cfg.Configuration();
		
	}
}
