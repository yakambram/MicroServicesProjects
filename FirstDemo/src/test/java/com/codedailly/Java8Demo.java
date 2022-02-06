package com.codedailly;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Java8Demo {

    public static void main(String[] args) {

        System.out.println("Stream without terminal operation");
        IntStream result = Arrays.stream(new int[]{1, 2, 3}).map(i -> {
            System.out.println("doubling " + i);
            return i * 2;
        });

        System.out.println("result.."+result.sum());
        System.out.println("Stream with terminal operation");
        int r = Arrays.stream(new int[]{1, 2, 3}).map(i -> {
            System.out.println("doubling " + i);
            return i * 2;
        }).sum();

        System.out.println(r);


        Sayable sayable = (s)-> "Hello--"+s;
        System.out.println(sayable.say("YK"));


    }
}
