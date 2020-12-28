package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(7,10,11,11,23,23,36,14,52,63,88);

        long min = nums.stream().min((x,y) -> x.compareTo(y)).get();

        System.out.println(min);

        long max = nums.stream().min((x,y) -> y.compareTo(x)).get();

        System.out.println(max);

        nums.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        long evenMin = nums.stream().filter(integer -> integer%2 == 0).min((x,y) -> x.compareTo(y)).get();

        System.out.println("even min " +evenMin);

        long oddMin = nums.stream().filter(integer -> integer%2 == 1).min((x,y) -> x.compareTo(y)).get();

        System.out.println("odd min " +oddMin);

        long oddMax = nums.stream().filter(integer -> integer%2 == 1).max((x,y) -> x.compareTo(y)).get();

        System.out.println("odd max " +oddMax);
    }
}
