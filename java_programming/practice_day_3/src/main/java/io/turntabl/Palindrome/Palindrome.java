package io.turntabl.Palindrome;

public class Palindrome {

    public Boolean isPalindrome(String input) {
        input = input.replaceAll(" ", "").toLowerCase();

        StringBuilder reverseStringBuilder = new StringBuilder();

        for(int i = input.length() -1 ;i >= 0;i-- ){
            reverseStringBuilder.append(input.charAt(i));
        }
        String reversedString = reverseStringBuilder.toString();

        return reversedString.equals(input);
    }

    public boolean isPalindrome2(String input){
        input = input.replaceAll(" ", "").toLowerCase();
        int leftIndex = 0;
        int rightIndex = input.length() -1;

        while(leftIndex < rightIndex) {
            if(input.charAt(leftIndex) != input.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
