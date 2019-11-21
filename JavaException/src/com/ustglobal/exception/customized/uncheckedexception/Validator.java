package com.ustglobal.exception.customized.uncheckedexception;

public class Validator {
	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException("try after sometime");
		}
	}

}
