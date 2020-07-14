package com.company;

import java.time.Duration;
import java.time.Instant;

public class Task7 {
    /**
     * Задача 7
     * 10001-ое простое число
     *
     * Выписав первые шесть простых чисел,
     * получим 2, 3, 5, 7, 11 и 13.
     * Очевидно, что 6-ое простое число - 13.
     *
     * Какое число является 10001-ым простым числом?
     *
     * >> RESULT    -- 104743
     * >> TIME (MS) -- 2102
     */
    public static void main(String[] args) {
        Instant t1, t2;
        long TIME;

        t1 = Instant.now();

        int count  = 2;
        int finish = 10_001;

        int  simpleCount  = 0;
        long simpleNumber = count;

        while (simpleCount != finish){
            if ( isSimple(count) ){
                simpleNumber = count;
                simpleCount++;
            }
            count++;
        }

        t2 = Instant.now();

        TIME = Duration.between(t1, t2).toMillis();

        System.out.println("RESULT    -- " + simpleNumber);
        System.out.println("TIME (MS) -- " + TIME);
    }

    public static boolean isSimple(int number){
        for (int n = 2; n < number; n++){
            if (number % n == 0){
                return false;
            }
        }
        return true;
    }
}
