package com.shivangi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOf
{
    // Arrays.stream()
    // Stream.of()
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};

        IntStream intStream = Arrays.stream(a);  // Supports only primitive data types.

        Stream s = Stream.of(a);

        Stream s1 = Stream.of(1, 2, 3, 4);

        Stream s2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);

        Stream res = Stream.concat(s1, s2).distinct();

        res.forEach(System.out::println);
    }
}
