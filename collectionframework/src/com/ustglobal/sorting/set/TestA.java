package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
//no index for set 
//doesnt preserve insertion order
//doesnt have get method.. either for-each or iterator we have to use 
//duplicates are not allowed
//multipl null values are not allowed
public class TestA {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(23);
		hs.add(45);
		hs.add("deepa");
		hs.add(76.43);
		hs.add(23);//duplicates are not allowed
		hs.add(null);
		hs.add(null);//multiple nulls are not allowed
		System.out.println("*******using for each*******");
		for (Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("*******using iterator*******");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
