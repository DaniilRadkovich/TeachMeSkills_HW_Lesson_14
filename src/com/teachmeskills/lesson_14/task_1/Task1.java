package com.teachmeskills.lesson_14.task_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> randomInt = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            randomInt.add((int) (0 + Math.random() * 100));
        }
        System.out.println("Your list: " + randomInt);

        System.out.println("Distinct your list: " + distinct(randomInt));
        System.out.println("Even numbers from 7 to 17: " + allEven(randomInt));
        System.out.println("Multiply by 2: " + multiplyByTwo(randomInt));
        System.out.println("Sorted numbers: " + sorting(randomInt));
        System.out.println("Count of numbers in your list: " + count(randomInt));
        System.out.println("Average of all numbers: " + average(randomInt));
    }

    private static List<Integer> distinct(List<Integer> randomInt) {
        return randomInt.stream().distinct().collect(Collectors.toList());
    }

    private static List<Integer> allEven(List<Integer> randomInt) {
        return randomInt.stream().limit(17).skip(6).filter(v -> v % 2 == 0).collect(Collectors.toList());
    }

    private static List<Integer> multiplyByTwo(List<Integer> randomInt) {
        return randomInt.stream().map(v -> v * 2).collect(Collectors.toList());
    }

    private static List<Integer> sorting(List<Integer> randomInt) {
        return randomInt.stream().sorted().limit(4).collect(Collectors.toList());
    }

    private static long count(List<Integer> randomInt) {
        return randomInt.stream().count();
    }

    private static OptionalDouble average(List<Integer> randomInt) {
        return randomInt.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average();
    }
}