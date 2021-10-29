package com.skilldistillery.cards;

public enum Suit {
	HEARTS("Heart"),
	SPADES("Spades"),
	CLUBS("Club"),
	DIAMONDS("Diamonds");

	private String name;
	
	Suit(String nm){
		name = nm;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
