package com.ismaillagouilly.poker;

import java.util.Scanner;

/**
 * Created by Ismail Lagouilly.
 */

/* ******************************************************************************** */
/*                                                                                  */
/*  Main Class                                                                      */
/*                                                                                  */
/*  Contains the minimum instructions required to start up a Poker Game.            */
/*                                                                                  */
/*                                                                                  */
/* ******************************************************************************** */

public class Main {

    public static void main(String[] args) {

        // DisplayInformation Instantiation
        DisplayInformation displayScoresImplSystemOut = new DisplayInformationImpl();

        // Display opening banner
        displayScoresImplSystemOut.displayOpeningBanner();

        // Player1 Instantiation
        Scanner scannerInPlayer1 = new Scanner(System.in);
        System.out.print("Please enter a username for player1: ");
        String player1Username = scannerInPlayer1.nextLine();
        Player player1 = new Player(player1Username);

        // Player2 Instantiation
        Scanner scannerInPlayer2 = new Scanner(System.in);
        System.out.print("Please enter a username for player2: ");
        String player2Username = scannerInPlayer2.nextLine();
        Player player2 = new Player(player2Username);

        Deck deck = Deck.getInstance();

        player1.draw(deck);

		System.out.println(player1.getCards());

		player2.draw(deck);

		System.out.println(player2.getCards());

		Game game = new Game(player1, player2);

		game.drawTable(deck);

		System.out.println(game.getTable());

		System.out.println("Winner is: " + game.designateWinner(player1, player2).getUsername());

        // Display closing banner
        displayScoresImplSystemOut.displayClosingBanner();
    }
}
