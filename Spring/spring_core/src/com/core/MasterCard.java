package com.core;

public class MasterCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("verification successful by mastercard");
		return true;
	}
	public class VisaCard implements Card{
		
		public boolean verify(String cardNo) {
			System.out.println("verification successful by visacard");
			return true;
		}
	}

}
