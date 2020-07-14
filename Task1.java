package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    /**
     * Задача 1
     * Числа, кратные 3 или 5
     *
     * Если выписать все натуральные числа меньше 10,
     * кратные 3 или 5, то получим 3, 5, 6 и 9.
     * Сумма этих чисел равна 23.
     *
     * Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
     *
     * >> SUM       IS 233168
     * >> TIME (MS) IS 0
     */
    public static void main(String[] args) {
        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

	    int       sum = 0;
	    final int MAX = 1000;

	    for (int n = 1; n < MAX; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum += n;
            }
        }

	    t2 = Instant.now();

	    TIME = Duration.between(t1, t2).toMillis();

	    System.out.println("SUM       IS " + sum);
        System.out.println("TIME (MS) IS " + TIME);
    }
}
