package org.example;

import java.util.HashMap;
import java.util.Random;

public class Lab5 {
    private final int[] array;
    private final int arrayLen = 6;

    public Lab5() {
        this.array = new int[arrayLen];
//        alternateGenerate(); // for emma
        generateNumbers(); // hash map method
    }

    public int[] getArray() {
        return this.array;
    }

    private void generateNumbers() {
        HashMap<Integer, Boolean> usedNumbers = new HashMap<>();
        Random random = new Random();
        int index = 0;
        while(index < 6) {
            int value = random.nextInt(50);
            if(usedNumbers.get(value) == null) {
                usedNumbers.put(value, Boolean.TRUE);
                this.array[index] = value;
                index++;
            }
        }
        insertionSort();
    }

    private void insertionSort() {
        for(int i = 1; i < arrayLen; i++) {
            int currentValue = this.array[i];
            int j = i - 1;
            while (j >= 0 && this.array[j] > currentValue) {
                this.array[j + 1] = this.array[j];
                j--;
            }
            this.array[j + 1] = currentValue;
        }
    }

    private void alternateGenerate() {
        Random random = new Random();
        int[] usedNumberArray = new int[50];
        int index = 0;
        while(index < arrayLen) {
            int value = random.nextInt(50);
            if(usedNumberArray[value] == 0) {
                usedNumberArray[value] = value;
                this.array[index] = value;
                index++;
            }
        }
    }
}
