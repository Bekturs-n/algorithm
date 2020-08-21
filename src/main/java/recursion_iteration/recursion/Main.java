package recursion_iteration.recursion;

import java.util.Arrays;

/**
 * Рекурсивные алгоритмы с примером нахождения "Числа Фибоначчи";
 * <p>
 * Подробнее:
 * https://www.youtube.com/watch?v=2kSx7wMAhcc&list=PLAma_mKffTOT_qpTFv4KdD9DhOAUd5Rqy&index=1
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciBadAlg(5));

        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibonacciGoodAlg(n, mem));

    }

    /**
     * Для нахождения "Числа Фибоначчи" для 100, этому алгоритму потребуется 50 000 лет;
     */
    public static long fibonacciBadAlg(int n) {
//        включи 27 строчку чтобы посмотреть количество нахождения "ЧФ" для одного числа
//        System.out.println("фибоначчи для числа - " + n);
        if (n <= 1)
            return n;
        return fibonacciBadAlg(n - 1) + fibonacciBadAlg(n - 2);
    }

    public static long fibonacciGoodAlg(int n, long[] mem) {
        if (mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;

        long result = fibonacciGoodAlg(n-1, mem) + fibonacciGoodAlg(n-2, mem);
        mem[n] = result;

        return result;
    }

}
