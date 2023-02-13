package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FirstLamda {
    public static void main(String[] args) {
        //Supplier
        Supplier<String> supplier = () -> {
            System.out.println("I am inside supplier");
           return  "Hello Supplier!";
        };
        System.out.println(supplier.get());

        //Consumer
        Consumer<String> consumer = (String s)-> {
            System.out.println("I am inside Consumer");
            System.out.println(s);
        };
        consumer.accept("Hello Consumer!");

        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));
        strings.removeIf(s -> !s.startsWith("t"));
        strings.forEach(s -> System.out.println(s));



        User sarah = User.builder().name("Sarah").build();
        User james = User.builder().name("James").build();
        User john =  User.builder().name("John").build();
        User mary =  User.builder().name("Mary").build();

        List<User> users = List.of(sarah, james, john, mary);


        List<String> names = new ArrayList<>();

        Function<User, String> toName = (User user) -> user.getName();
        for (User user:
             users) {
            names.add(toName.apply(user));
        }

        users.forEach(u-> System.out.println(u));
        names.forEach(name -> System.out.println(name));

        IntSupplier supplierInt = ()-> 10;
        int i = supplierInt.getAsInt();
        System.out.println("i is "+ i);

        DoubleToIntFunction function = value -> (int)Math.floor(value);
        int pi = function.applyAsInt(Math.PI);
        System.out.println("pi is "+pi);
    }
}