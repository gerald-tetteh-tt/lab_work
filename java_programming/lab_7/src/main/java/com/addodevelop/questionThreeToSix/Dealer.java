package com.addodevelop.questionThreeToSix;

import java.util.ArrayList;
import java.util.Random;

public class Dealer {
    private final ArrayList<Card> deck;

    public Dealer() {
        this.deck = new ArrayList<>();
        resetDeck();
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public void resetDeck() {
        this.deck.clear();
        for(var suit: CardSuit.values()) {
            for(var cardValue: CardValue.values()) {
                var card = new Card(suit,cardValue);
                deck.add(card);
            }
        }
    }
    public void shuffleDeck() {
        Random random = new Random();
        for(int index = this.deck.size() - 1; index > 0; index--) {
            int selectedIndex = random.nextInt(index + 1);
            Card temp = this.deck.get(index);
            this.deck.set(index,this.deck.get(selectedIndex));
            this.deck.set(selectedIndex,temp);
        }
    }
}
