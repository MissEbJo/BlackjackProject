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


	public boolean isBlackJack() {
		
		
		return false;

	}

	public boolean isBust() {
		return false;
	}

public void winningConditions(List<Card> hand) {
	
}
	@Override
	public int getHandValue() { //return total value of cards in hands
		int totalVal = 0;
//		int aces = 0;
		
		for (Card card2 : card) {
			switch(card2.getValue()) {
//			case TWO: totalVal +=2; break;
//			case THREE: totalVal +=3; break;
//			case FOUR: totalVal +=4; break;
//			case FIVE: totalVal +=5; break;
//			case SIX: totalVal +=6; break;
//			case SEVEN: totalVal +=7; break;
//			case EIGHT: totalVal +=8; break;
//			case NINE: totalVal +=9; break;
//			case TEN: totalVal +=10; break;
//			case JACK: totalVal +=10; break;
//			case QUEEN: totalVal +=10; break;
//			case KING: totalVal +=10; break;
//			case ACE: totalVal +=11; break;
			
			
			
			}
			
		}
		
		return totalVal;
	}

}
