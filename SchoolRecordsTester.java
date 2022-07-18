package com.prodapt.basics;

public class SchoolRecordsTester {

	public static void main(String[] args) {
		SchoolRecords sr = new SchoolRecords();
		sr.dispRecords();
		SchoolRecords.addRecords(100, "Orchids The International School", "Thoraipakkam");
		SchoolRecords.addRecords(156, "Chettinad Vidyasharam", "Annamalaipuram");
		SchoolRecords.addRecords(276, "Adarsh Vidyalaya School", "Tnagar");
		SchoolRecords.addRecords(211, "Ambal Matriculation School", "Arumbakkam");
		
	}

}
