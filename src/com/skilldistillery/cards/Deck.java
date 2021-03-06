package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck;

	public static void main(String[] args) {
		Deck deck = new Deck();
//		deck.createDeck();
//		deck.cardsLeftInDeck() ;
		System.out.println(deck.checkDeckSize() - 5);
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

		return deck.size();

	}

	public Card dealCard() {
		return deck.remove(0);

	}

	public void shuffle() {
		Collections.shuffle(deck);

	}

	private int checkDeckSize() {
		return deck.size();

	}
}
