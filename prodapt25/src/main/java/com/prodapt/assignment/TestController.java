package com.prodapt.assignment;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Janani S", 21, "Software Engineer");
		Employee e2 = new Employee("Prasanna R", 21, "Software Engineer");
		Employee e3 = new Employee("Nivedha M", 21, "Software Engineer");
		HR_Manager hr = new HR_Manager();
		hr.process_Records(e1.name, e1.age, e1.designation);
		hr.process_Records(e2.name, e2.age, e2.designation);
		hr.process_Records(e3.name, e3.age, e3.designation);

	}

}
