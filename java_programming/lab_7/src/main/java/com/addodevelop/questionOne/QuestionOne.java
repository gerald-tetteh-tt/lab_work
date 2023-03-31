package com.addodevelop.questionOne;

import java.util.*;

public class QuestionOne {
    private final ArrayList<Integer> arrayList;
    private final SortedSet<Integer> sortedSet;

    public QuestionOne() {
        this.arrayList = new ArrayList<>();
        this.sortedSet = new TreeSet<>();
        generateNumbers();
        generateSetNumbers();
        this.arrayList.sort(null);
    }

    public void printArrayList() {
        System.out.println(arrayList.toString());
    }
    public void printSetNumbers() {
        System.out.println(sortedSet.toString());
    }

    private void generateNumbers() {
        Random random = new Random();
        HashMap<Integer,Boolean> usedNumbers = new HashMap<>();
        while(this.arrayList.size() < 6) {
            int value = random.nextInt(50);
            if(usedNumbers.get(value) == null) {
                this.arrayList.add(value);
                usedNumbers.put(value,true);
            }
        }
    }
    private void generateSetNumbers() {
        Random random = new Random();
        while(this.sortedSet.size() < 6) {
            int value = random.nextInt(50);
            this.sortedSet.add(value);
        }
    }
}
