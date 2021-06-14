package com.ismaillagouilly.poker;

/**
 * Created by Ismail Lagouilly.
 */

/* ********************************************************************************* */
/*                                                                                   */
/*  DisplayInformationImpl Class                                                     */
/*                                                                                   */
/*  Defines the methods required to display information about a Poker game.          */
/*                                                                                   */
/* ********************************************************************************* */

public class DisplayInformationImpl implements DisplayInformation {

    @Override
    public void displayOpeningBanner() {


        System.out.println("                   ########   #######  ##    ## ######## ########  ");
        System.out.println("                   ##     ## ##     ## ##   ##  ##       ##     ## ");
        System.out.println("                   ##     ## ##     ## ##  ##   ##       ##     ## ");
        System.out.println("                   ########  ##     ## #####    ######   ########  ");
        System.out.println("                   ##        ##     ## ##  ##   ##       ##   ##   ");
        System.out.println("                   ##        ##     ## ##   ##  ##       ##    ##  ");
        System.out.println("                   ##         #######  ##    ## ######## ##     ## ");
        System.out.println("                        ##    ##    ###    ########    ###    ");
        System.out.println("                        ##   ##    ## ##      ##      ## ##   ");
        System.out.println("                        ##  ##    ##   ##     ##     ##   ##  ");
        System.out.println("                        #####    ##     ##    ##    ##     ## ");
        System.out.println("                        ##  ##   #########    ##    ######### ");
        System.out.println("                        ##   ##  ##     ##    ##    ##     ## ");
        System.out.println("                        ##    ## ##     ##    ##    ##     ## \n\n\n");

    }

    @Override
    public void displayClosingBanner() {

        System.out.print("\n\n\n");
        System.out.println("                              ######## ##    ## ########    ");
        System.out.println("                              ##       ###   ## ##     ##   ");
        System.out.println("                              ##       ####  ## ##     ##   ");
        System.out.println("                              ######   ## ## ## ##     ##   ");
        System.out.println("                              ##       ##  #### ##     ##   ");
        System.out.println("                              ##       ##   ### ##     ##   ");
        System.out.println("                              ######## ##    ## ########    ");
    }
}
