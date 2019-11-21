package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		
		ls.add(23.4);
		ls.add(65.8);
		ls.add(54.2);
		ls.add(87.1);
		ls.add(76.2);
		
		System.out.println("****using for-each****");
		for (Double d : ls) {
			System.out.println(d);
		}
		
		System.out.println("****using iterator*****");
		Iterator it = ls.iterator();
		while (it.hasNext()) {
			Object d = it.next();
			System.out.println(d);
		}
	}
}
