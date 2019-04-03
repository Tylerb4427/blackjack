package blackjack;

public class BlackJackCard extends Card {

    public BlackJackCard(String cardRank, String cardSuit, int cardPointValue) {
        super(cardRank, cardSuit, cardPointValue);
    }

    public BlackJackCard(int cardPointValue, String cardSuit) {
        super(cardPointValue, cardSuit);
    }

    public BlackJackCard() {
        super();
    }

    public int getValue() {
        return super.pointValue();
    }

}
