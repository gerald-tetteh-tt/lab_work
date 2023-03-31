package com.addodevelop.questionThreeToSix;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int valueCompareResult = card1.getValue().getOrder() - (card2.getValue().getOrder());
        if(valueCompareResult != 0) {
            return valueCompareResult;
        }
        return card1.getSuit().name().compareTo(card2.getSuit().name());
    }
}
