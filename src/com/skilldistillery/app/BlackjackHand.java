package com.skilldistillery.app;

import java.util.List;

import com.skilldistillery.cards.Card;
import com.skilldistillery.entities.Dealer;

public class BlackjackHand {

	public BlackjackHand() {

	}

	public int isBlackJack(List<Card> dealerHand, List<Card> playerHand, int playerHandTotal, int dealerHandTotal,
			Dealer dealer) {
		int playerHandTotals = dealer.calculateHandTotals(playerHand);
		int dealerHandTotals = dealer.calculateHandTotals(dealerHand);

		int keepAtIt = 0;
		// if player hand total is 21

		if (playerHandTotals == 21) {
			if (dealerHandTotals < 21) {
				System.out.println("BLACKJACK! Player Wins!");
				keepAtIt = 1;
			} else if (playerHandTotals == dealerHandTotals) {
				System.out.println("Sorry, folks. No winners today. It's a DRAW!");
				keepAtIt = 2;
			}
		}
		return keepAtIt;
	}

	public int winningConditions(List<Card> dealerHand, List<Card> playerHand, int playerHandTotal, int dealerHandTotal,
			Dealer dealer) {
		int playerHandTotals = dealer.calculateHandTotals(playerHand);
		int dealerHandTotals = dealer.calculateHandTotals(dealerHand);
		// if the player hand total is greater than the dealer hand

		int keepAtIt = 0;
		if (playerHandTotals > dealerHandTotals) {
			System.out.println("Player Wins by default. Hey dealer, try your luck another day!");
			keepAtIt = 1;
		}
		// if dealer hand total is greater than the player hand
		else if (dealerHandTotals > playerHandTotals) {
			System.out.println("Dealer Wins by default because it's his game! Get Outta here!!");
			keepAtIt = 2;
		}

		// if the hand totals of player and dealer are same, its a DRAW (push)
		else {
			System.out.println("Awww, there's not winners here today. It's a DRAW, folks!");
		}
		return keepAtIt;

	}

}
