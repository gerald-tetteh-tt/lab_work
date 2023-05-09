package io.turntabl.card;
public class Card {
    private final CardSuit suit;
    private final CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value.getValue();
    }

    @Override
    public String toString() {
        return value.name() + " of " + suit.name();
    }
}
