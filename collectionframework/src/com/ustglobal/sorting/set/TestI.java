package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		SortByName sn = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicr sm = new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		
		Bank b1 = new Bank("SBI", 577101, 7263743);
		Bank b2 = new Bank("CANARA", 577211, 9876543);
		Bank b3 = new Bank("SYNDICATE", 577151, 4876343);
		Bank b4 = new Bank("HDFC", 577156, 9573484);
		Bank b5 = new Bank("HDFC", 577156, 9573484);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("****using iterator****");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			
			System.out.println("NAME is "+b.name);
			System.out.println("PINCODE is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			
			System.out.println("***********************");
		}
		
		
	}
}
