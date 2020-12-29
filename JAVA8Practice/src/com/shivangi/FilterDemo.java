package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        // get the list of even integer numbers.
        List<Integer> res = nums.stream().filter(integer -> integer%2 == 0).collect(Collectors.toList());

        res.forEach(integer -> System.out.println(integer));

        List<String> cities = Arrays.asList("Mumbai", "delhi", "kolkata", "Bangalore");

        // get the list with length greater than 6
        List<String> length = cities.stream()
                .filter(i -> i.length()>6).collect(Collectors.toList());

        System.out.println("length of cities");
        length.forEach(integer -> System.out.println(integer));

        System.out.println("count of cities");

        // get the count of cities with length greater than 6.
        long count = cities.stream().filter(s -> s.length() > 6).count();

        System.out.println(count);
    }
}
