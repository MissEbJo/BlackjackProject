package com.skilldistillery.entities;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Player {

	private int playerHandtotal;
	private int dealerHandTotal;

	public Player() {
	}

	public void playerHand(Scanner input, List<Card> playerHand) {
		Deck deck = new Deck();
		int numCards = 2;
		boolean playing = true;

		System.out.println("The player's hand has been dealt.");
		playerHand = new ArrayList<>();
		int totalValue = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = deck.dealCard();
			totalValue += c.getValue();
			deck.shuffle();
			playerHand.add(c);

		}
		for (int i = 0; i < playerHand.size(); i++) {
			Object[] hands = playerHand.toArray();
			System.out.println(hands[i]);
		}
		System.out.println(totalValue);

//		while(playing) {
		System.out.println("Do you want to hit(1) or stay(2)?");
		int choice = input.nextInt();
		if(choice == 1) {
			Card c = deck.dealCard();
			totalValue += c.getValue();
			playerHand.add(c);
			System.out.println(playerHand);
			System.out.println(totalValue);
			
		}
			System.out.println("Do you want to hit(1) or stay(2)?");
			 choice = input.nextInt();
			if(choice == 1) {
				Card c = deck.dealCard();
				totalValue += c.getValue();
				playerHand.add(c);
				System.out.println(playerHand);
				System.out.println(totalValue);
			
		}

		}
		

	public void dealerHand(Scanner input, List<Card> dealerHand) {
		Deck deck = new Deck();
		int numCards = 2;

		dealerHand = new ArrayList<>(numCards);
		int totalValue = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = deck.dealCard();
			totalValue += c.getValue();
			deck.shuffle();
			dealerHand.add(c);

		}
	}
}
