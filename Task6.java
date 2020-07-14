package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task6 {
    /**
     * Сумма квадратов первых десяти натуральных чисел равна
     * 1^2 + 2^2 + ... + 10^2 = 385
     *
     * Квадрат суммы первых десяти натуральных чисел равен
     * (1 + 2 + ... + 10)^2 = 552 = 3025
     *
     * Следовательно, разность между суммой квадратов
     * и квадратом суммы первых десяти
     * натуральных чисел составляет
     * 3025 − 385 = 2640.
     *
     * Найдите разность между суммой квадратов
     * и квадратом суммы первых ста натуральных чисел.
     *
     * >> RESULT    -- 25164150
     * >> TIME (MS) -- 0
     */
    public static void main(String[] args) {
        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

        long sumREG = 0;
        long sumSQU = 0;

        long squSum;
        long result;

        int max = 100;

        for (int n = 1; n <= max; n++){
            sumREG += n;
            sumSQU += n * n;
        }

        squSum = sumREG * sumREG;
        result = squSum - sumSQU;

        t2 = Instant.now();

        TIME = Duration.between(t1, t2).toMillis();

        System.out.println("RESULT    -- " + result);
        System.out.println("TIME (MS) -- " + TIME);
    }
}
