package io.turntabl.uniqueString;

import java.util.Collections;

public class UniqueString {

    public Boolean isUnique(String string) {
        for(int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if(string.lastIndexOf(letter) != i) {
                return false;
            }
        }
        return true;
    }
}
