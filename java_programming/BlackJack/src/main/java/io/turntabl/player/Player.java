package io.turntabl.player;

import io.turntabl.card.Card;

import java.util.ArrayList;

public class Player {
    private final ArrayList<Card> hand;
    private int totalValue;
    private final int id; // player ID

    public Player(int id) {
        this.hand = new ArrayList<>();
        this.id = id;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getId() {
        return id;
    }

    // add initial two cards at the start of the game
    public void addInitCards(Card first, Card second) {
        hand.add(first);
        hand.add(second);
        totalValue += first.getValue() + second.getValue();
        System.out.println("Player " + id + " starts with " + totalValue);
        System.out.println();
    }

    public void hit(Card card) {
        hand.add(card);
        totalValue += card.getValue();
        System.out.println("Player " + id + " hit " + card);
        System.out.println("Player " + id + " has a hand of "+ totalValue);
        System.out.println();
    }

    public void stick() {
        System.out.println("Player " + id + " sticks.");
        System.out.println("Player " + id + " has a hand of "+ totalValue);
        System.out.println();
    }
}
