package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(11,11,23,23,36,14,52,63,88);

        long min = nums.stream().min((x,y) -> x.compareTo(y)).get();

        System.out.println(min);

        long max = nums.stream().min((x,y) -> y.compareTo(x)).get();

        System.out.println(max);

        nums.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);



    }
}
