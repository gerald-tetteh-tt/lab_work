package com.addodevelop.questionThreeToSix;

public class Card implements Comparable<Card> {
    private final CardSuit suit;
    private final CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public CardValue getValue() {
        return this.value;
    }
    public CardSuit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return this.suit.name() + this.value.getValue();
    }

    @Override
    public int hashCode() {
        return this.suit.ordinal() + this.value.ordinal();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        return card.toString().equals(this.toString());
    }

    @Override
    public int compareTo(Card card) {
        int valueCompareResult = this.value.getOrder() - (card.value.getOrder());
        if(valueCompareResult != 0) {
            return valueCompareResult;
        }
        return this.suit.name().compareTo(card.suit.name());
    }
}
