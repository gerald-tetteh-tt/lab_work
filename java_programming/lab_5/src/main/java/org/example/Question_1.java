package org.example;

import java.util.Random;

public class Question_1 {
    private final int[] array;

    public Question_1() {
        this.array = new int[6];
//        alternateGenerate(); // for emma
    }

    public int[] getArray() {
        return this.array;
    }

    public void alternateGenerate() {
        Random random = new Random();
        int[] usedNumberArray = new int[50];
        int index = 0;
        while(index < 6) {
            int value = random.nextInt(50);
            if(usedNumberArray[value] == 0) {
                usedNumberArray[value] = value;
                this.array[index] = value;
                index++;
            }
        }
    }
}
