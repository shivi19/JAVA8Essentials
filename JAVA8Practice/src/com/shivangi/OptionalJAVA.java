package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalJAVA
{
    public static void main(String[] args)
    {
        List<String> values = Arrays.asList("A89", "A24", "A67", "G107", "A46", "G56", "H67");

        Optional<String> optionalS = values.stream().filter(i -> i.startsWith("L")).findFirst();

        optionalS.ifPresent(System.out::println);

        System.out.println(optionalS.orElseGet(() ->"hello"));

        System.out.println(optionalS.orElse("not found"));

        Optional o1 = Optional.of("shivangi");

        Optional o2 = Optional.ofNullable(null);

        System.out.println(o1);
        System.out.println(o2);
    }
}
