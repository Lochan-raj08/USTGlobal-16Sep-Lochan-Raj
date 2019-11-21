package com.ustglobal.Immutable;

public class TestString {
	public static void main(String[] args) {
		
		MyString ms = new MyString(12, "Sharref");
		System.out.println(ms.getName());
		System.out.println(ms.getrollNo());
		System.out.println(ms);
		
		MyString ms1 = ms.changeContent(13, "Amith");
		System.out.println(ms.getName());
		System.out.println(ms.getrollNo());
		
		System.out.println("==============");
		
		System.out.println(ms1.getName());
	}

}
