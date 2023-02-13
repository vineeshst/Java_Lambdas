package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class CreatingComparator {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        Comparator<String> cmp = (s1, s2) -> s1.compareTo(s2);
        strings.sort(cmp);
        System.out.println("Alphabetic sorting ..."+strings);

//        Comparator<String> cmp1 = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        Function<String, Integer> toLength = s -> s.length();

        Comparator<String> cmp1 = Comparator.comparing(toLength);
        strings.sort(cmp1);
        System.out.println("Length sorting ..."+strings);



    }
}
