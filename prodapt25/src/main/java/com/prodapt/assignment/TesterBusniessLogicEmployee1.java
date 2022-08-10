package com.prodapt.assignment;

import java.util.ArrayList;

public class TesterBusniessLogicEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusinessLogicEmployee1 ble= new BusinessLogicEmployee1();
		ArrayList<Employee1> details=ble.addDetails();
		ble.processDetails(details);
	}

}

