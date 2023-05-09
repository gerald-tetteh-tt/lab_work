package io.turntabl;

import io.turntabl.Palindrome.Palindrome;
import io.turntabl.mostCommonLeastCommon.MostCommonLeastCommon;
import io.turntabl.uniqueString.UniqueString;

public class Main {
    public static void main(String[] args) {
        MostCommonLeastCommon mostCommonLeastCommon = new MostCommonLeastCommon();
        System.out.println(mostCommonLeastCommon.mostCommonLeastCommon(5,3));

//        Palindrome palindrome = new Palindrome();
//        System.out.println(palindrome.isPalindrome2("madam"));
//        System.out.println(palindrome.isPalindrome2("nurses run"));
//        System.out.println(palindrome.isPalindrome2("nurses ru"));
//        System.out.println(palindrome.isPalindrome2("nurses ruN"));

        UniqueString uniqueString = new UniqueString();

//        System.out.println(uniqueString.isUnique("yello"));
//        System.out.println(uniqueString.isUnique("five"));
//        System.out.println(uniqueString.isUnique("six"));
//        System.out.println(uniqueString.isUnique("seven"));
    }
}