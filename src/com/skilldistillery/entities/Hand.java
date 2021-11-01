package com.skilldistillery.entities;

import java.util.List;

import com.skilldistillery.cards.Card;

public abstract class Hand {
	protected List<Card> card;

	public Hand() {
	}

	public void addCard(Card card) {

	}

	public void clear() {
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [card=" + card + "]";
	}

}
