package com.shivangi;

import java.util.stream.IntStream;

interface ABC
{
   void show();
}
public class FunctionalDemo
{
    public static void main(String[] args)
    {
        ABC object = () -> System.out.println("hello world");
        object.show();

        ABC abc = new ABC() {
            @Override
            public void show() {
                System.out.println("hello anonymous class");
            }
        };

        IntStream intStream = IntStream.generate(() -> 0);

        System.out.println(intStream.findAny().orElse(10));
    }
}
