package com.Assignment;

import java.util.Scanner;

import com.core.Card;

public class PaymentApplicationClass {
	private Card card;    //interface reference

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	public void pay(String cardNo,int amt) {
		if(card.verify(cardNo))
		{
			 Scanner sc=new Scanner(System.in);
		  System.out.println("enter choice");
		  System.out.println("1.mastercard"+"\n"+"2.visacard");
		  System.out.println("payment by mastercard");
		  System.out.println("payment by visacard");
		  int choice1=sc.nextInt();
		  switch (choice1) {
		case 1:
			//std.pay("1", 1000);
			break;

		default:
			break;
		}
		}
	        //std.pay("1", 1000);

			System.out.println("payment successful"+amt);
		
	}
}
