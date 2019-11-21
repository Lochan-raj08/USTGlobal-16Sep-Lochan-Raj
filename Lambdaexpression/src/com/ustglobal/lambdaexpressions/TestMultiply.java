package com.ustglobal.lambdaexpressions;

public class TestMultiply {
	public static void main(String[] args) {
		
		Multiplyinterface multi = (a,b)->a*b;
		int product = multi.multiply(20, 10);
		System.out.println("Product is "+product);
	}

}
