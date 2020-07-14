package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task5 {
    /**
     * Задача 5
     * Наименьшее кратное
     *
     * 2520 - самое маленькое число,
     * которое делится без остатка
     * на все числа от 1 до 10.
     *
     * Какое самое маленькое число
     * делится нацело на все числа
     * от 1 до 20?
     *
     * >> CURRENT NUMBER -- 232792560
     * >> TIME (MS)      -- 2488
     */
    public static void main(String[] args) {
        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

        int limit         = 20;
        int currentNumber = 20;

        while ( !isDelimited(currentNumber, limit) ){
            currentNumber++;
        }

        t2 = Instant.now();

        TIME = Duration.between(t1, t2).toMillis();

        System.out.println("CURRENT NUMBER -- " + currentNumber);
        System.out.println("TIME (MS)      -- " + TIME);

    }

    public static boolean isDelimited(int number, int maxDelimiter){
        for (int n = 2; n <= maxDelimiter; n++){
            if (number % n != 0){
                return false;
            }
        }
        return true;
    }
}
