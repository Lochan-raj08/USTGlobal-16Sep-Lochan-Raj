package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kukku", 98756);
		hm.put("bala", 534261);
		hm.put("amith", 66454264);
		hm.put(null, 77665544);
		hm.put(null, 774433);
		
		System.out.println("Data "+hm);
		hm.put("bala", 657483);
		System.out.println("After modify "+hm);
		hm.put("dimple", 88990066);
		System.out.println("After modify "+hm);
		System.out.println("================");
		Object name = hm.get("amith");
		System.out.println("Value "+name);
		
		Object phoneno = hm.get("she");
		System.out.println("Value "+phoneno);
		
		Object value = hm.remove("kukku");
		System.out.println("Value "+value);
		
		System.out.println("After remove --->"+hm);
		
	}

}
