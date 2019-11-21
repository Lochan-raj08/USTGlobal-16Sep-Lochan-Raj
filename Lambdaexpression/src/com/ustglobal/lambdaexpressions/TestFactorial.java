package com.ustglobal.lambdaexpressions;

public class TestFactorial {
	public static void main(String[] args) {

		Factorialinterface fi = (n) -> {

			int fact = 1;
			for(int i=2;i<=n;i++) {
				fact=fact*i;
			}
			return fact;
		};

		int factTotal = fi.fact(5);
		System.out.println("Factorial is "+factTotal);
	}

}
