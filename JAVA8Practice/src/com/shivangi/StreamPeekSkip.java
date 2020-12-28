package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekSkip
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(7,10,11,11,23,23,36,14,52,63,88);

        // skip will ignore the given top values
        // peek is used to add intermediate action in the stream
        // peek is basically used for debugging the code.
        List<Integer> result = nums.stream().peek(System.out::println).filter(integer -> integer%2==0).skip(2).collect(Collectors.toList());

        System.out.println("**********");
        result.stream().forEach(System.out::println);
    }
}
