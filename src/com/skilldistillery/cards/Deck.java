package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.skilldistillery.entities.Hand;

public class Deck {

	private List<Card> deck;
	public static void main(String[] args) {
		Deck deck = new Deck();
//		deck.createDeck();
//		deck.cardsLeftInDeck() ;
		System.out.println(deck.checkDeckSize() -5);
	}

	public Deck() {
		deck = createDeck();
	}

	private List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}

		return deck;
	}
	
	public int cardsLeftInDeck() {
		int numCards = 5;
//		
		Deck deck = new Deck();
		
		return deck.checkDeckSize() - numCards;
		
		
	}


	public Card dealCard() {
		return deck.remove(0);

	}
	public void dealCard(Hand hand) {
		
		
	}

	public void shuffle() {
		Collections.shuffle(deck);
		

	}
	private int checkDeckSize() {
		return deck.size();
		
	}
}
