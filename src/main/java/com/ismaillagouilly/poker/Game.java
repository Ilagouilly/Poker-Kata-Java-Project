package com.ismaillagouilly.poker;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

/**
 * Created by Ismail Lagouilly.
 */

/* ********************************************************************************* */
/*                                                                                   */
/*  Game Class                                                                       */
/*                                                                                   */
/*  Manages a Poker Game by drawing cards and designating a winner.                  */
/*                                                                                   */
/*   The class uses Lombok java library to automatically generate                    */
/*   Getters & Setters. More information on the link: https://www.projectlombok.org/ */
/*                                                                                   */
/* ********************************************************************************* */

@Getter
@Setter
class Game {

    private Player player1;
    private Player player2;
    private ArrayList<Card> table;
    private static final Short MAX_TABLE_CARDS = 5;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        table = new ArrayList<Card>();
    }

    void drawTable(Deck deck) {

        if(deck.getInstance().getCardDeck() != null && deck.getInstance().getCardDeck().size() >= MAX_TABLE_CARDS) {
            Short index = MAX_TABLE_CARDS;

            while(index > 0) {
                Card card = deck.getInstance().getCardDeck().iterator().next();
                table.add(card);
                deck.getInstance().getCardDeck().remove(card);
                index--;
            }
        }
    }

    Player designateWinner(Player player1, Player player2) {
        // TODO : Implement code to determine a winner.
        return player1;
    }
}
