package io.turntabl.card;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getValue() {
        Card card = new Card(CardSuit.DIAMONDS,CardValue.JACK);
        assertEquals(10,card.getValue());
    }
}