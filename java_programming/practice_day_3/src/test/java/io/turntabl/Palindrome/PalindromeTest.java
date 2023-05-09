package io.turntabl.Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromeAssertsTrue() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("madam"));
    }

    @Test
    void isPalindromeAssertsFalse() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome("madaam"));
    }

    @Test
    void isPalindrome2AssertsTrue() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome2("madam"));
    }

    @Test
    void isPalindrome2AssertsFalse() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome2("madaam"));
    }
}