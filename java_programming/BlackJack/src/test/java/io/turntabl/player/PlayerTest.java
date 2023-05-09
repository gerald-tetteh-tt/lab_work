package io.turntabl.player;

import io.turntabl.card.Card;
import io.turntabl.card.CardSuit;
import io.turntabl.card.CardValue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    StringWriter expectedStringWriter;
    PrintWriter printWriter;

    @BeforeEach
    void setUp() {
        player = new Player(1);
        System.setOut(new PrintStream(outputStreamCaptor));
        expectedStringWriter = new StringWriter();
        printWriter = new PrintWriter(expectedStringWriter);
    }

    @Test
    void getTotalValue() {
        player.hit(new Card(CardSuit.DIAMONDS, CardValue.ACE));
        player.hit(new Card(CardSuit.HEARTS, CardValue.THREE));
        assertEquals(14,player.getTotalValue());
    }

    @Test
    void getId() {
        assertEquals(1,player.getId());
    }

    @Test
    void hit() {
        player.hit(new Card(CardSuit.DIAMONDS, CardValue.ACE));
        player.hit(new Card(CardSuit.HEARTS, CardValue.THREE));
        assertEquals(14,player.getTotalValue());
        printWriter.println("Player 1 hit ACE of DIAMONDS");
        printWriter.println("Player 1 has a hand of 11");
        printWriter.println();
        printWriter.println("Player 1 hit THREE of HEARTS");
        printWriter.println("Player 1 has a hand of 14");
        printWriter.println();
        printWriter.close();
        assertEquals(expectedStringWriter.toString().trim(), outputStreamCaptor.toString().trim());
    }

    @Test
    void stick() {
       player.stick();
       printWriter.println("Player 1 sticks.");
       printWriter.println("Player 1 has a hand of 0");
       printWriter.println();
       printWriter.close();
       assertEquals(expectedStringWriter.toString().trim(), outputStreamCaptor.toString().trim());
    }

    @Test
    void addInitCards() {
        Card card1 = new Card(CardSuit.DIAMONDS, CardValue.FIVE);
        Card card2 = new Card(CardSuit.HEARTS, CardValue.QUEEN);
        player.addInitCards(card1, card2);
        assertEquals(15, player.getTotalValue());

        printWriter.println("Player 1 starts with 15");
        printWriter.println();
        printWriter.close();
        assertEquals(expectedStringWriter.toString().trim(), outputStreamCaptor.toString().trim());
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }
}