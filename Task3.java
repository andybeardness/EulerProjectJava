package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task3 {
    /**
     * Задача 3
     * Наибольший простой делитель
     *
     * Простые делители числа 13195 - это 5, 7, 13 и 29.
     *
     * Каков самый большой делитель числа 600851475143,
     * являющийся простым числом?
     *
     * >> MAX PF    IS 6857
     * >> TIME (MS) IS 0
     */
    public static void main(String[] args) {
        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

        long N = 600851475143L;
        long maxPF = 0L;
        long delimiter = 2L;

        while (delimiter * delimiter <= N){
            if (N % delimiter == 0){
                maxPF = delimiter;
                N /= delimiter;
            }
            else{
                delimiter++;
            }
        }

        if (N > 1){
            maxPF = N;
        }

        t2 = Instant.now();

        TIME = Duration.between(t1, t2).toMillis();

        System.out.println("MAX PF    IS " + maxPF);
        System.out.println("TIME (MS) IS " + TIME);
    }
}

