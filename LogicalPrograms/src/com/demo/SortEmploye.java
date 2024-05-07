package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortEmploye {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Madhu", 20, 50000));
		emplist.add(new Employee("RAM", 25, 55000));
		emplist.add(new Employee("Madhav", 27, 70000));

		emplist.forEach(e -> System.out.println(e));

		List<Employee> sortedbyanme = emplist.stream().sorted((e1, e2) -> e1.name.compareTo(e2.name))
				.collect(Collectors.toList());

		sortedbyanme.forEach(System.out::println);

		List<Employee> sortbySalary =emplist.stream().sorted(Comparator.comparingDouble(Employee :: getSalary))
				.collect(Collectors.toList());
		
		sortbySalary.forEach(System.out :: println);
		
		emplist.stream()
				.filter(e -> e.salary > 50000)
				.sorted(Comparator.comparingDouble(Employee :: getSalary))
				.forEach(System.out :: println);
		
		
		
	}

	static class Employee {

		private String name;
		private int age;
		private int salary;

		public Employee(String name, int age, int salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

	}

}
