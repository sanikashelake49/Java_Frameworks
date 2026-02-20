package com.core;

public class PaymentAppClass {
	private Card card;    //interface reference

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	public void pay(String cardNo,int amt) {
		if(card.verify(cardNo))
			System.out.println("payment successful"+amt);
		
	}

}
