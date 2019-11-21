package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "ajay");
		ht.put(202, "vijay");
		ht.put(500, "don");
		ht.put(99, "agasthya");
		ht.put(101, "jaisriram");
//		ht.put(null, "john"); Nullpointerexception
//		ht.put(308, null);
		
		System.out.println("Data "+ht); 
	}

}
