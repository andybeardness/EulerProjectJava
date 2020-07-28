package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task9 {
    /**
     * Задача 9
     * Особая тройка Пифагора
     *
     * Тройка Пифагора - три натуральных
     * числа a < b < c, для которых
     * выполняется равенство
     *
     * a^2 + b^2 = c^2
     *
     * Например,
     * 32 + 42 = 9 + 16 = 25 = 52.
     *
     * Существует только одна тройка Пифагора,
     * для которой a + b + c = 1000.
     *
     * Найдите произведение abc.
     *
     * >> RESULT    -- 31875000
     * >> TIME (MS) -- 5
     *
     * PS : Это решение подсмотрел :с
     */

    public static void main(String[] args) {

        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

        int total = 1000;
        int result = run(total);

        t2 = Instant.now();

        TIME = Duration.between(t1, t2).toMillis();

        System.out.println("RESULT    -- " + result);
        System.out.println("TIME (MS) -- " + TIME);

    }
    public static int run(int total) {
        for (int a = 1; a <= total; a++) {
            for (int b = a + 1; b <= total; b++) {
                int c = total - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
