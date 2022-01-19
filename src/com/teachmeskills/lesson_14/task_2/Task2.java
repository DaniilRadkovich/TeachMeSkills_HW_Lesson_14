package com.teachmeskills.lesson_14.task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> studentsNames = new ArrayList<>();
        studentsNames.add("Arkadiy");
        studentsNames.add("Daniil");
        studentsNames.add("Valdemar");
        studentsNames.add("Katerina");
        studentsNames.add("Jana");
        studentsNames.add("Ivan");
        studentsNames.add("Alexandr");
        studentsNames.add("Maxim");
        studentsNames.add("Andrian");
        studentsNames.add("Alexey");
        studentsNames.add("Igor");
        studentsNames.add("Dmitry");
        studentsNames.add("Pavel");

        System.out.println("All students list: " + studentsNames);

        String myName = "Daniil";
        String letterTheNameStarts = "a";

        System.out.println("Number of students with name " + myName + ": " + studentsWithYourName(studentsNames, myName));
        System.out.println("All names, which starts with " + "'" + letterTheNameStarts + "'" + ": " + namesWithA(studentsNames, letterTheNameStarts));
        System.out.println("First name in sorted list: " + firstSortedName(studentsNames));
    }

    private static int studentsWithYourName(List<String> studentsNames, String myName) {
        return (int) studentsNames.stream().filter(n -> n.equalsIgnoreCase(myName)).count();
    }

    private static List<String> namesWithA(List<String> studentsNames, String letterTheNameStarts) {
        return studentsNames.stream().filter(n -> n.toLowerCase().startsWith(letterTheNameStarts.toLowerCase())).collect(Collectors.toList());
    }

    private static List<String> firstSortedName(List<String> studentsNames) {
        if (!studentsNames.isEmpty()) {
            return studentsNames.stream().sorted().limit(1).collect(Collectors.toList());
        } else {
            return Collections.singletonList("Empty@");
        }
    }
}
