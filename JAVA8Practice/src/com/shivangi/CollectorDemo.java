package com.shivangi;

import com.shivangi.POJO.Person;

import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorDemo
{
    public static void main(String[] args) {
        Person person = new Person("shivangi", 23);
        Person person1 = new Person("mamta", 27);
        Person person2 = new Person("aditya", 28);
        Person person3 = new Person("saroj", 21);
        Person person4 = new Person("vamika", 3);
        Person person5 = new Person("vamika", 3);


        List<Person> personList = Arrays.asList(person,person1,person2,person3,person4,person5);
        personList.stream().forEach(System.out::println);

        personList.stream().map(Person::getName).collect(Collectors.toSet()).forEach(System.out::println);

        String joined = personList.stream().map(p -> p.getName().toString()).collect(Collectors.joining(","));

        System.out.println(joined);

        // average of age
        double avg = personList.stream().collect(Collectors.averagingInt(Person::getAge));
        System.out.println(avg);

        // threshhold age
        Map<Boolean, List<Person>> lis = personList.stream().collect(Collectors.partitioningBy(e->e.getAge() > 20));
        lis.forEach((x,y) -> System.out.println(x+" " +y));





    }
}
