package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("arun");
		ts.add("amjad");
		ts.add("imran");
		ts.add("john cena");
		ts.add("amith");
		
		System.out.println("****using for-each****");
		for (String s : ts) {
			System.out.println(s);
		}
		
		System.out.println("****using iterator*****");
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
