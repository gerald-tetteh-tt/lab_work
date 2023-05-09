package com.addodevelop.questionThreeToSix;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DealerTest {

    @Test
    public void testResetDeck() {
        Dealer dealer = new Dealer();
        assertEquals(dealer.getDeck().size(),52);
    }

    @Test
    public void testDealerDeckUniqueness() {
        Dealer dealer = new Dealer();
        var deck = dealer.getDeck();
        HashSet<Card> cardSet = new HashSet<>(deck);
        assertEquals(cardSet.size(),deck.size());
    }

    @Test
    public void testShuffleDeck() {
        Dealer dealer = new Dealer();
        var deck = dealer.getDeck();
        System.out.println(deck);
        dealer.shuffleDeck();
        var shuffledDeck = dealer.getDeck();
        System.out.println(shuffledDeck);
        assertEquals(deck,shuffledDeck);
    }
}
