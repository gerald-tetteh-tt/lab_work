package com.addodevelop.questionThreeToSix;

public record Card(CardSuit suit, CardValue value) implements Comparable<Card> {

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
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        return card.toString().equals(this.toString());
    }

    @Override
    public int compareTo(Card card) {
        int valueCompareResult = this.value.getOrder() - (card.value.getOrder());
        if (valueCompareResult != 0) {
            return valueCompareResult;
        }
        return this.suit.name().compareTo(card.suit.name());
    }
}
