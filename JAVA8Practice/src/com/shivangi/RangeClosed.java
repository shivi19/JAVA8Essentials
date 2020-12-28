package com.shivangi;

import java.util.stream.IntStream;

public class RangeClosed
{
    public static void main(String[] args)
    {
        IntStream intStream = IntStream.range(1,10); // print from 1 to 9

        intStream.forEach(System.out::println);

        IntStream intStream1 = IntStream.rangeClosed(1,10); // print from 1 to 10
        intStream1.forEach(System.out::println);
    }
}
