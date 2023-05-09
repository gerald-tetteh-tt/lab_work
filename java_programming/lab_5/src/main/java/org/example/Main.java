package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Lab5 lab5 = new Lab5();
//        System.out.println(Arrays.toString(lab5.getArray()));

        ArrayList<Integer> arrList;
        arrList = new ArrayList<>();

        LinkedList<Boolean> linkedList;
        linkedList = new LinkedList<>();

        arrList.add(5);
        arrList.add(6);
        arrList.add(5);
        arrList.add(9);

        linkedList.add(false);
        linkedList.add(true);
        linkedList.add(true);

        arrList.remove(0);

//        System.out.println(arrList.size());
//        System.out.println(linkedList.size());

        for(int number: arrList) {
            System.out.println(number);
        }
    }
}