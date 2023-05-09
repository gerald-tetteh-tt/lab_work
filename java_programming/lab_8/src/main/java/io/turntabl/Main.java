package io.turntabl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc("add").apply(2,3));
        System.out.println(calc("subtract").apply(5,6));
        System.out.println(calc("power").apply(7,7));
        System.out.println("//////////////////////////////////////");
        printListZip(List.of(1,2,3,4,5),List.of(4,5,6,7,8), List::of);
        getZip(List.of(1,2,3,4,5),List.of(4,5,6,7,8), List::of);
        System.out.println(curryAdd(5).apply(40));

        Random rd = new Random();
        rd.nextInt(31);
    }

    public static BinaryOperator<Integer> calc(String method) {
        return switch (method) {
            case "add" -> Integer::sum;
            case "subtract" -> (x,y) -> x - y;
            case "power" -> (x,y) -> (int) Math.pow(x,y);
            default -> null;
        };
    }

    public static void printListZip(List<Integer> first, List<Integer> second, Zip<Integer> func) {
        int index = 0;
        while(index < first.size()) {
            System.out.println(func.apply(first.get(index),second.get(index))) ;
            index++;
        }
    }

    public static void getZip(List<Integer> first, List<Integer> second, Zip<Integer> func) {
        int index = 0;
        List<List<Integer>> result = new LinkedList<>();
        while(index < first.size()) {
            result.add(func.apply(first.get(index),second.get(index))) ;
            index++;
        }
        System.out.println(result);
    }

    public static Function<Integer,Integer> curryAdd(Integer number) {
        return (x) -> x + number;
    }
}