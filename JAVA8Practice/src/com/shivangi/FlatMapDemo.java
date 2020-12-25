package com.shivangi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo
{
    public static void main(String[] args)
    {
        List<String> stringList = Stream.of("a","b").map(String::toUpperCase).collect(Collectors.toList());
        stringList.forEach(i -> System.out.println(i));

        
    }
}
