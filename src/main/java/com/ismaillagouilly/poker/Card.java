package com.ismaillagouilly.poker;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ismail Lagouilly.
 */

/* ********************************************************************************* */
/*                                                                                   */
/*  Card Class                                                                       */
/*                                                                                   */
/*                                                                                   */
/*   The class uses Lombok java library to automatically generate                    */
/*   Getters & Setters. More information on the link: https://www.projectlombok.org/ */
/*                                                                                   */
/* ********************************************************************************* */

@Getter
@Setter
class Card {

    private String rank;
    private String suite;

    Card(String rank, String suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public String toString(){
        return "Card: {" + this.rank + " : " + this.suite + "} ";
    }
}
