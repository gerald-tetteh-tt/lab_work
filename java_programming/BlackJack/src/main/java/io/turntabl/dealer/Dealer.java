package io.turntabl.dealer;

import io.turntabl.card.Card;
import io.turntabl.card.CardSuit;
import io.turntabl.card.CardValue;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    // holds a deck of cards
    private final ArrayList<Card> deck;

    public Dealer() {
        this.deck = new ArrayList<>();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    // generate 52 cards and store them
    // in the deck
    public void generateCards() {
        deck.clear();
        for(var suit: CardSuit.values()) {
            for(var cardValue: CardValue.values()) {
                Card card = new Card(suit,cardValue);
                deck.add(card);
            }
        }
    }

    // remove a card from the
    // top of the deck
    public Card deal() {
        int lastIndex = deck.size() - 1;
        Card card = deck.get(lastIndex);
        deck.remove(lastIndex);
        return card;
    }

    // shuffle using collections
    // static method
    public void shuffle() {
        Collections.shuffle(this.deck);
    }
}
