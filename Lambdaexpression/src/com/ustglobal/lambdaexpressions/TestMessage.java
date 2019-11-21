package com.ustglobal.lambdaexpressions;

public class TestMessage implements Message {
	public static void main(String[] args) {

		Message msg1 = (msg)-> {
			System.out.println("hello");
			System.out.println(msg);

		};
	}

	@Override
	public void greet(String message) {
		
		
	}
}


