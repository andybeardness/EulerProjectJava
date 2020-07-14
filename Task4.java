package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task4 {
    /**
     * Задача 4
     * Наибольшее произведение-палиндром
     *
     * Число-палиндром с обеих сторон
     * (справа налево и слева направо) читается одинаково.
     * Самое большое число-палиндром,
     * полученное умножением
     * двух двузначных чисел – 9009 = 91 × 99.
     *
     * Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
     *
     * >> MAX PALINDROME -- 906609
     * >> 1ST NUM        -- 913
     * >> 2ST NUM        -- 993
     * >> TIME (MS)      -- 2056
     */
    public static void main(String[] args) {
        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

        int maxPalindrome = 0;

        int iMax          = 0;
        int jMax          = 0;

        int start         = 100;
        int stop          = 999;

        int multiply;

        for (int i = start; i <= stop; i++){
            for (int j = i; j <= stop; j++){
                multiply = i * j;
                if ( isPalindrome(multiply) ){
                    if (multiply > maxPalindrome){
                        maxPalindrome = multiply;
                        iMax = i;
                        jMax = j;
                    }
                }
            }
        }

        t2 = Instant.now();

        TIME = Duration.between(t1, t2).toMillis();

        System.out.println("MAX PALINDROME -- " + maxPalindrome);
        System.out.println("1ST NUM        -- " + iMax);
        System.out.println("2ST NUM        -- " + jMax);
        System.out.println("TIME (MS)      -- " + TIME);
    }

    public static boolean isPalindrome(int number){
        String strNumber        = String.valueOf(number);
        String strNumberReverse = new StringBuilder(strNumber).reverse().toString();
        return strNumber.equals(strNumberReverse);
    }
}
