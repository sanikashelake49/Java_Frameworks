package com.Assignment;

import com.core.Card;

public class VisaCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("verification successful by visacard");
		return true;
	}

}
