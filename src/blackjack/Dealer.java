package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class Dealer extends AbstractPlayer  {

private Deck deck = new Deck();

public Dealer(){
    super();
}

//define Dealer class here
	
	
	
	
	//instance variable - Deck 





	//constructors





	//method to shuffle
        public void shuffle(){
            deck.shuffle();
        }





	//method to deal a card
        public Card deal(){
            return deck.nextCard();
        }




	//hit method goes here
        public boolean hit(){
            return true;
        }
}