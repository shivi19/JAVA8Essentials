package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        List<Integer> res = nums.stream().filter(integer -> integer%2 == 0).collect(Collectors.toList());

        res.forEach(integer -> System.out.println(integer));


        List<String> cities = Arrays.asList("Mumbai", "delhi", "kolkata", "Bangalore");

        List<String> length = cities.stream()
                .filter(i -> i.length()>6).collect(Collectors.toList());

        System.out.println("length of cities");
        length.forEach(integer -> System.out.println(integer));

        System.out.println("count of cities");

        long count = cities.stream().filter(s -> s.length() > 6).count();

        System.out.println(count);




    }
}
