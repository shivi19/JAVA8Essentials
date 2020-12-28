package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Hi JAVA";
    }

    public static void main(String[] args) {
        Supplier<String> stringSupplier = new SupplierDemo();

        System.out.println(stringSupplier.get());

        Supplier supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello supplier";
            }
        };

        Supplier supplier1 = () -> "hello there";

        System.out.println(supplier.get());

        System.out.println(supplier1.get());

        List<Integer> nums = Arrays.asList();

        System.out.println(nums.stream().findAny().orElseGet(supplier1));

    }
}
