package com.shivangi;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class ConsumerImpl implements Consumer<Integer>
{
    @Override
    public void accept(Integer integer)
    {
        System.out.println(integer);
    }
}
public class ConsumerDemo
{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        ConsumerImpl consumer = new ConsumerImpl();
     //   nums.forEach(consumer);

        // we can do it like this

        Consumer consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        nums.forEach(consumer1);
    }
}
