package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("kukku", 98756);
		hm.put("bala", 534261);
		hm.put("amith", 66454264);
		
		HashMap hm1 = new HashMap();
		hm1.put("Shareef", 7654);
		hm1.put("Faizan", 78652);
		hm1.put("Lochan", 86596696);
		
		boolean haskey = hm.containsKey("bala");
		System.out.println("Has key "+haskey);
		
		boolean hasValue = hm.containsKey(78652);
		System.out.println("Has Value "+hasValue);
		
		hm.putAll(hm1);
		
		System.out.println("=====================");
		
		System.out.println("After put all "+hm);
		
		System.out.println("===========");
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
	
	}
	
	
	

}
