package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        // perform multiplication mon each entry of list
        List<Integer> res = nums.stream().map(i -> i*2).collect(Collectors.toList());
        res.forEach(i->System.out.println(i));
        // creates a list of list
        List nums2 = nums.stream().map(i -> Arrays.asList(i, i*2)).collect(Collectors.toList());

        nums2.forEach(i->System.out.println(i));

        List<String> values = Arrays.asList("A89", "A24", "A67", "G107", "a46");

        List<String> result = values.stream().map(String :: toUpperCase).filter(f -> f.startsWith("A")).collect(Collectors.toList());

        result.forEach(i->System.out.println(i));
    }
}
