package com.shivangi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer)
    {
        if(integer%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicateDemo.test(4));

        Predicate predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer o) {
                if(o%2 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
        System.out.println(predicate.test(4));

        Predicate<Integer> predicate11 = t -> t%2==0;

        System.out.println(predicate11.test(4));

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        nums.stream().filter(t -> t%2==0).forEach(System.out::println);
    }
}
