package recursion_iteration.iteration;

/**
 * Итеративный алгоритмы с примером нахождения "Числа Фибоначчи";
 * <p>
 * Подробнее:
 * https://www.youtube.com/watch?v=2kSx7wMAhcc&list=PLAma_mKffTOT_qpTFv4KdD9DhOAUd5Rqy&index=1
 */

public class Main {

    public static void main(String[] args) {
        System.out.println();
    }

    public long fibonacci(int n) {
        long[] array = new long[n + 1];

        array[0]=0;
        array[1]=1;

        for(int i = 2; i<=n; i++)
            array[i] = array[i-1]+ array[i-2];

        return array[n];
    }
}
