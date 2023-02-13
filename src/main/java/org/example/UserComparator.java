package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserComparator {

    public static void main(String[] args) {
        User sarah = User.builder().name("Sarah").age(28).build();
        User james = User.builder().name("James").age(35).build();
        User mary = User.builder().name("Mary").age(24).build();
        User john1 = User.builder().name("John").age(25).build();

        User john2 = User.builder().name("John").age(33).build();

        List<User> users = Arrays.asList(sarah, james, mary, john1,  john2);

        Comparator<User> cmpName = Comparator.comparing(user -> user.getName());

        Comparator<User> cmpAge = Comparator.comparing(user -> user.getAge());
        Comparator<User> comparator =  cmpName.thenComparing(cmpAge);

        Comparator<User> reverse = comparator.reversed();

        users.sort(reverse);
        users.forEach(u-> System.out.println(u));
    }





}
