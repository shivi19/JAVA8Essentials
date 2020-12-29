package com.shivangi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(111,111,222,333,444,555,555,555,666,666);
        List<String> stringList = Arrays.asList("abc","xyz","abc","xyz","pqr", "lmn");

        Set<Integer> uniqueSet = new HashSet<>();

        // get the list of unique numbers.
        Set<Integer> duplicateNumeber = numberList.stream()
                .filter(integer -> !uniqueSet.add(integer)).collect(Collectors.toSet());

        duplicateNumeber.forEach(i -> System.out.println(i));

        System.out.println(duplicateNumeber);
        Set<String> uniqueString = new HashSet<>();
        // get the list of unique strings.
        Set<String> duplicateString = stringList.stream()
                .filter(integer -> !uniqueString.add(integer)).collect(Collectors.toSet());
        duplicateString.forEach(i -> System.out.println(i));
    }
}
