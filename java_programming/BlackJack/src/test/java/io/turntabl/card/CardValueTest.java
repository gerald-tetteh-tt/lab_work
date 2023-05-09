package io.turntabl.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardValueTest {
    @Test
    void getValue() {
        CardValue queen = CardValue.QUEEN;
        CardValue two = CardValue.TWO;
        CardValue ace = CardValue.ACE;
        assertEquals(10,queen.getValue());
        assertEquals(2,two.getValue());
        assertEquals(11,ace.getValue());
    }
}