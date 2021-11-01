package com.skilldistillery.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;
import com.skilldistillery.entities.Player;

public class Dealer {
	public Scanner input = new Scanner(System.in);
	
	public Dealer() {}

	
	public void playGame() {
		Deck desk = new Deck();
		Player play = new Player();
		System.out.println("Welcome to BlackJack! Ready to play?");
		//shuffle 
		List<Card> playerHand = new ArrayList<>();
		List<Card> dealerHand = new ArrayList<>();
		//deal player two cards face up, show value, show total
		play.playerHand(input, playerHand);
		//deal to dealer two cards, one is hidden, show total of only one card
		play.dealerHand(input, dealerHand);
		
		
	}
}
