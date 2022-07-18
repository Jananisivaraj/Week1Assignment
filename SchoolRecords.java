package com.prodapt.basics;

public class SchoolRecords {
  String name;
  int id;
  String address;
  static void addRecords(int id,String name,String address)
  {
       System.out.println(id+" "+name+" "+address);
  }
  void dispRecords()
  {
	  System.out.println("Displaying School Records");
	  
}
}
