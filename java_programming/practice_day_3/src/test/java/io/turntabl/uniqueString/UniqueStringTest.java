package io.turntabl.uniqueString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueStringTest {

    @Test
    void isUniqueAssertsTrue() {
        UniqueString uniqueString = new UniqueString();
        assertTrue(uniqueString.isUnique("this"));
    }

    @Test
    void isUniqueAssertsFalse() {
        UniqueString uniqueString = new UniqueString();
        assertFalse(uniqueString.isUnique("thiss"));
    }
}