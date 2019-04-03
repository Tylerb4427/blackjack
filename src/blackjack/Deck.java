package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;
    public static final String[] ranks = {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
    public static final String suits[] = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};
    public static final int[] vals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    private int topCardIndex = 51;

    private ArrayList<Card> stackOfCards;

    public Deck() {
        //initialize data - stackOfCards - topCardIndex
        //loop through suits
        //loop through faces
        //add in a new card
        stackOfCards = new ArrayList<Card>();
        for (int j = 0; j < ranks.length; j++) {
            for (String suitString : suits) {
                stackOfCards.add(new BlackJackCard(ranks[j], suitString, vals[j]));
            }
        }
        //shuffle();
    }

    //modifiers
    public void shuffle() {
        Collections.shuffle(stackOfCards);	//shuffle the deck
        topCardIndex = 51;//reset variables as needed
    }

    //accessors
    public int size() {
        return stackOfCards.size();
    }

    public int numCardsLeft() {
        return topCardIndex + 1;

    }

    public Card nextCard() {
        return stackOfCards.get(topCardIndex--);

    }

    public String toString() {
        return stackOfCards + "   topCardIndex = " + topCardIndex;
    }
}
