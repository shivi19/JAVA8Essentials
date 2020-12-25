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

    }
}
