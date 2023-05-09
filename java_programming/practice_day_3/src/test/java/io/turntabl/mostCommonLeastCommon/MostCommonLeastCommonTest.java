package io.turntabl.mostCommonLeastCommon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

class MostCommonLeastCommonTest {

    private MostCommonLeastCommon mostCommonLeastCommon;

    @BeforeEach
    void setUp() {
        mostCommonLeastCommon = new MostCommonLeastCommon();
    }

    @Test
    void testReadWordsSuccessfully() {
        List<String> actualWords = List.of(
                "hear",
                "knock",
                "now",
                "when",
                "hear",
                "yesterday",
                "when",
                "some",
                "before",
                "when",
                "some",
                "knock",
                "hear",
                "hear",
                "yesterday",
                "tomorrow",
                "some"
        );
        List<String> words = mostCommonLeastCommon.readWords();
        assertEquals(actualWords,words);
    }

    @Test
    void testReturnsMostCommonAndLeastCommon() {
        List<String> actualMostCommon = List.of("hear", "when", "some");
        List<String> actualLeastCommon = List.of("before", "now", "tomorrow", "yesterday","knock");
        var result = mostCommonLeastCommon.mostCommonLeastCommon(3,5);

        assertEquals(2,result.size());

        List<String> mostCommon = result.get("mostCommon");
        List<String> leastCommon = result.get("leastCommon");

        assertEquals(actualMostCommon, mostCommon);
        assertEquals(actualLeastCommon, leastCommon);
    }

    @Test
    void shouldThrowException(){
        assertThrows(IllegalArgumentException.class, () -> mostCommonLeastCommon.mostCommonLeastCommon(99,99));
    }
}
