package com.addodevelop.questionThreeToSix;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int valueCompareResult = card1.value().getOrder() - (card2.value().getOrder());
        if(valueCompareResult != 0) {
            return valueCompareResult;
        }
        return card1.suit().name().compareTo(card2.suit().name());
    }
}
