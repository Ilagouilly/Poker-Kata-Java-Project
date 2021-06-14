package com.ismaillagouilly.poker;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

/**
 * Created by Ismail Lagouilly.
 */

/* ********************************************************************************* */
/*                                                                                   */
/*  Player Class                                                                     */
/*                                                                                   */
/*  Manages players of a Poker game.                                                 */
/*                                                                                   */
/*   The class uses Lombok a java library to automatically generate                  */
/*   Getters & Setters. More information on the link: https://www.projectlombok.org/ */
/*                                                                                   */
/* ********************************************************************************* */

@Getter
@Setter
public class Player {

    private String username;
    private Double balance;
    private ArrayList<Card> cards;
    private static final Short MAX_PLAYER_CARDS = 2;

    public Player(String username) {

        this.username = username;
        balance = 100.0;
        cards = new ArrayList<Card>();
    }

    void draw(Deck deck) {

    	if(deck.getInstance().getCardDeck() != null && deck.getInstance().getCardDeck().size() >= MAX_PLAYER_CARDS) {
    		Short index = MAX_PLAYER_CARDS;
            while(index > 0) {
            	Card card = deck.getInstance().getCardDeck().iterator().next();
            	cards.add(card);
            	deck.getInstance().getCardDeck().remove(card);
            	index--;
        	}
    	}
	}
}
