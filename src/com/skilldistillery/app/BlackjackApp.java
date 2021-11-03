package com.skilldistillery.app;

import java.util.Scanner;

import com.skilldistillery.entities.Dealer;

public class BlackjackApp {
	private Dealer dealer;

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.launch();
	}

	public void launch() {
		dealer = new Dealer();
		Scanner input = new Scanner(System.in);
		dealer.playGame(input);
	}
}
