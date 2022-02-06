package com.codedailly;

public interface Function2 <T, U, R> {

    R apply(T t, U u);

    default void count() {
      System.out.println("hello");
    }

}
