package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(32);
		ts.add(76);
		ts.add(12);
		ts.add(98);
		ts.add(76);
		//ts.add(null);  it throws null pointer exception
		//ts.add("shareef"); it gives error throws class cast exception
		//it allows only generics
		System.out.println("****using for-each****");
		for (Object s : ts) {
			System.out.println(s);
		}
		
		System.out.println("****using iterator****");
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
	}
}
