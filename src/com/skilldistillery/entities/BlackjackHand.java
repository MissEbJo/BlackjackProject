package com.skilldistillery.entities;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}

//	public void getPlayerCardsAndValue(Scanner sc, Deck deck) {
//
//		int numCards = sc.nextInt();
//		if (numCards > 52) {
//			throw new InputMismatchException();
//		}
//
//		List<Card> hand = new ArrayList<>(numCards);
//		int totalValue = 0;
//		for (int i = 0; i < numCards; i++) {
//			Card c = deck.dealCard();
//			totalValue += c.getValue();
//			deck.shuffle();
//			hand.add(c);
//		}
////	      getHandValue(hand, totalValue);
//
////		return 0;
//	}

	public boolean isBlackJack() {
		return false;

	}

	public boolean isBust() {
		return false;
	}

//	public int getHandValue(int totalValue) {
//		Deck deck = new Deck();
////		Card[] hand = deck.Deck();
////		for (Card card : hand) {
//
////		}
//		return totalValue;
//	}

	@Override
	public int getHandValue() {
//		int handVal = 0; 
//		for (int i = 0; i< cards.size(); i++) {
//			handVal += cards.get(i).getValue();
//		}
		return 0;
	}

}
