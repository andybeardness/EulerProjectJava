package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task2 {
    /**
     * Задача 2
     * Четные числа Фибоначчи
     *
     * Каждый следующий элемент ряда Фибоначчи получается
     * при сложении двух предыдущих.
     * Начиная с 1 и 2, первые 10 элементов будут:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     *
     * Найдите сумму всех четных элементов ряда Фибоначчи,
     * которые не превышают четыре миллиона.
     *
     * >> SUM       IS 4613732
     * >> TIME (MS) IS 0
     */
    public static void main(String[] args) {
        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

        final int STOP   = 4_000_000;

        int  first  = 1;
        int  second = 2;
        int  next   = first + second;
        long sum    = second;

        while (next <= STOP) {
            if (next % 2 == 0){
                sum += next;
            }

            first  = second;
            second = next;
            next   = first + second;
        }

        t2 = Instant.now();

        TIME = Duration.between(t1, t2).toMillis();

        System.out.println("SUM       IS " + sum);
        System.out.println("TIME (MS) IS " + TIME);
    }
}
