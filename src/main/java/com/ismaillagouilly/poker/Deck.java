package com.ismaillagouilly.poker;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

/**
 * Created by Ismail Lagouilly.
 */

/* ********************************************************************************* */
/*                                                                                   */
/*  Deck Class                                                                       */
/*                                                                                   */
/*                                                                                   */
/*   The class uses Lombok java library to automatically generate                    */
/*   Getters & Setters. More information on the link: https://www.projectlombok.org/ */
/*                                                                                   */
/* ********************************************************************************* */

@Getter
@Setter
class Deck {

	private static Deck deck = null;

    private Set<Card> cardDeck;

    private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
	private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    
    public static Deck getInstance() {
        if (deck == null)
            deck = new Deck();
  
        return deck;
    }

    private Deck() {
    	cardDeck = new HashSet<Card>();
    	for (String suit : suits) {
        	for (String rank : ranks) {
           		cardDeck.add( new Card(rank,suit) );
        	}
    	}
	}

	public void refill() {
		for (String suit : suits) {
        	for (String rank : ranks) {
           		cardDeck.add( new Card(rank,suit) );
        	}
    	}
	}
}
