package com.ustglobal.exception.customized.checkedexception;

public class ValidateAmount {
	void checkAmount(int amount) throws InvalidAmountException {
		if(amount>4000) {
			throw new InvalidAmountException();
		}
	}

}
