package com.addodevelop;

import com.addodevelop.questionOne.QuestionOne;
import com.addodevelop.questionThreeToSix.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // question 1
        QuestionOne questionOne = new QuestionOne();
        questionOne.printArrayList();
        questionOne.printSetNumbers();
        // question 3
        Card dNine = new Card(CardSuit.D,CardValue.NINE);
        Card sT = new Card(CardSuit.S,CardValue.T);
        Card hQ = new Card(CardSuit.H,CardValue.Q);
        Card c8 = new Card(CardSuit.C,CardValue.EIGHT);
        Card sA = new Card(CardSuit.S,CardValue.A);
        Card dNine2 = new Card(CardSuit.D,CardValue.NINE);
        System.out.println(dNine.equals(dNine2));
        System.out.println(dNine.equals(sA));
        // question 4
        TreeSet<Card> set = new TreeSet<>();
        set.add(dNine);
        set.add(sA);
        set.add(sT);
        set.add(hQ);
        set.add(dNine2);
        set.add(c8);
        for(var card: set) {
            System.out.println(card);
        }
        System.out.println("\n");
        // question 5;
        ArrayList<Card> cardArrayList = new ArrayList<>();
        cardArrayList.add(dNine);
        cardArrayList.add(sA);
        cardArrayList.add(sT);
        cardArrayList.add(hQ);
        cardArrayList.add(dNine2);
        cardArrayList.add(c8);
        Collections.sort(cardArrayList,new CardComparator());
        for(var card: cardArrayList) {
            System.out.println(card);
        }
        // question 6
    }
}