package com.skilldistillery.entities;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Player {

	private int playerHandtotal;
	private int dealerHandTotal;

	public Player() {
	}

	public int playerTurns(Scanner input, List<Card> playerHand, int totalValue, Deck editableDeck) {
		Dealer dealer = new Dealer();
		totalValue = dealer.calculateHandTotals(playerHand);
		boolean playing = true;
		int keepAtIt = 0;
		while (playing) {
			System.out.println("Do you want to (1)Hit or (2)Stand: ");
			int choice = input.nextInt();
			if (choice == 1) {
				Card c = editableDeck.dealCard();
				totalValue += c.getValue();
				playerHand.add(c);
				System.out.println(playerHand + " " + totalValue);

				if (totalValue > 21) {
					System.out.println("Player has busted! You lost & Dealer wins!");
					keepAtIt = 1;
					playing = false;
//					break;
				}
			} else if (choice == 2) {
				System.out.println("Player has stood. Dealer's turn.");
				playing = false;
//				break;
			}
		}
		return keepAtIt;
	}

	public int dealerTurns(Scanner input, List<Card> dealerHand, int totalValue, Deck editableDeck) {
		Dealer dealer = new Dealer();
		totalValue = dealer.calculateHandTotals(dealerHand);
		boolean dealerplaying = true;
		int keepAtIt = 0;
		while (dealerplaying) {
			System.out.println();
			System.out.println(dealerHand);
			if (totalValue == 21) {
				System.out.println("BLACKJACK! Dealer wins!");
				dealerplaying = false;
			}
			if (totalValue < 17) {
				System.out.println("The dealer has hit.");
				Card c = editableDeck.dealCard();
				totalValue += c.getValue();
				dealerHand.add(c);
				System.out.println(dealerHand + " " + totalValue);
			} else if (totalValue >= 17 && totalValue <= 21) {
				System.out.println("The dealer has stood.");
				keepAtIt =2;
				dealerplaying = false;
				break;
			} else {
				System.out.println("Dealer has busted. Dealer loses. Player Wins!");
				dealerplaying = false;
				keepAtIt = 1;
				break;
			}
		}
		return keepAtIt;
	}

}
