package com.vk.collections;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vinay", "Ajay", "Ram");

        // Predicate example
        Predicate<String> myPredicate = name -> name.length() > 3;
        names.stream().filter(myPredicate).forEach(System.out::println);
        System.out.println("************************************");

        // Consumer example
        Consumer<String> printConsumer = (name) -> System.out.println(name);
        names.forEach(printConsumer);
        System.out.println("************************************");

        // Supplier example
        Supplier<String> randomStringSupplier = () -> UUID.randomUUID().toString();
        System.out.println(randomStringSupplier.get());
        System.out.println("************************************");

        // Function example
        Function<String, Float> stringToIntegerFunction = Float::parseFloat;
        System.out.println(stringToIntegerFunction.apply("123"));
    }
}
