package com.prodapt.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessLogicEmployee1 {

	ArrayList<Employee1> addDetails() {
		 
		 ArrayList<Employee1> details= new ArrayList<Employee1>();
		 
		 details.add(new Employee1(8001, "Athvi",21, 100000f, "SSE"));
		 details.add(new Employee1(8002, "Prasanna",22, 75000f, "SE"));
		 details.add(new Employee1(8003, "Janani",20, 50000f, "ASE"));
		 details.add(new Employee1(8004, "Isai",20, 40000f, "ASE"));
		 details.add(new Employee1(8005, "Nivetha",23, 60000f, "ASE")); 
		 details.stream().forEach((i)->System.out.println(i));
		 return details;
}
	void processDetails(ArrayList<Employee1> details) {
		 System.out.println("Details After Sorting");
		 
		 List < Employee1> Employee1SortedList = details.stream().sorted(Comparator.comparing(Employee1::getSalary)).collect(Collectors.toList()); 
		 Employee1SortedList.forEach(i -> System.out.println(i));
		 }
}
