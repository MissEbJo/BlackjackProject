package com.skilldistillery.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.app.BlackjackHand;
import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer {
//	public Scanner input = new Scanner(System.in);

	public Dealer() {
	}

	public void playGame(Scanner input) {
		Deck deck = new Deck();
		Player play = new Player();
		Dealer dealerMain = new Dealer();
		BlackjackHand blackjack = new BlackjackHand();
		boolean playForever = true;
		System.out.println("Welcome to BlackJack! Ready to play?");
		// shuffle
		deck.shuffle();
		while (playForever) {
			// create hands & hand totals for each player & dealer
			List<Card> playerHand = new ArrayList<>();
			int playerHandTotal = 0;
			List<Card> dealerHand = new ArrayList<>();
			int dealerHandTotal = 0;
			// deal player two cards face up, show value, show total
			dealPlayerHand(input, playerHand, playerHandTotal, deck);
			// deal to dealer two cards, one is hidden, show total of only one card
			dealDealerHand(input, dealerHand, dealerHandTotal, deck);

			int whoa = blackjack.isBlackJack(dealerHand, playerHand, playerHandTotal, dealerHandTotal, dealerMain);
			if (whoa == 1) {
				playForever = false;
				break;
			}
			// add what's on isBlackJack to player & dealer turns & finish whoa2 logic
			int whoa3 = play.playerTurns(input, playerHand, playerHandTotal, deck);
			if (whoa3 == 1) {
				playForever = false;
				break;
			}

			int whoa4 = play.dealerTurns(input, dealerHand, playerHandTotal, deck);

			if (whoa4 == 1) {
				playForever = false;
				break;
			}
			if (whoa4 == 2) {
				 blackjack.winningConditions(dealerHand, playerHand, playerHandTotal, dealerHandTotal,
						dealerMain);
//				playForever = false;
//				break;
			}
//			if (whoa2 == 1) {
//				playForever = false;
//				break;
//			}
			playForever = false;
		}
	}

	public void dealPlayerHand(Scanner input, List<Card> playerHand, int playerHandTotal, Deck editableDeck) {
		int numCards = 2;

		System.out.println("The player's hand has been dealt.");
		int totalValue = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = editableDeck.dealCard();
			totalValue += c.getValue();
			playerHand.add(c);
		}
		System.out.println(playerHand + " Total value of player hand: " + totalValue);
//		

	}

	public void dealDealerHand(Scanner input, List<Card> dealerHand, int dealerHandTotal, Deck editableDeck) {
		int numCards = 2;
		System.out.println("The dealer hand has been dealt.");
		int totalValue = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = editableDeck.dealCard();
			totalValue += c.getValue();
			dealerHand.add(c);

		}
		System.out.println("Dealer Hand: " + dealerHand.get(0).toString() + " and [Hidden]"
				+ " Total value of dealer hand: " + dealerHand.get(0).getValue());
	}

	public int calculateHandTotals(List<Card> hand) {
		int handTotal = 0;
		for (Card card : hand) {
			handTotal += card.getValue();
		}

		return handTotal;

	}
}
