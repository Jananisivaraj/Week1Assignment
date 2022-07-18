package com.prodapt.basics;

public class SimpleInterest {
	static int SI;
	static int principal;
	static int time;
	static int rate;
	static int totalAmount;
	void simple_Interest(int principal,int rate,int time)
	{
		SI = ((principal*rate*time)/100);
		System.out.println("SimpleInterest = "+SI);
		totalAmount = principal + SI;
		System.out.println("Amount to be paid after loan = "+totalAmount);
	}
}
