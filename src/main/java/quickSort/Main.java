package quickSort;

import java.util.Arrays;

/**
 * Быстрая сортировка;
 *
 * Сложность алгоритма: O(n log n), наихудщий вариант: O(n^2);
 *
 * Используется алгоритм "разделяй и владствуй"
 *
 * Полезные ссылки:
 * https://ru.wikipedia.org/wiki/%D0%91%D1%8B%D1%81%D1%82%D1%80%D0%B0%D1%8F_%D1%81%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0
 * https://www.youtube.com/watch?v=ywWBy6J5gz8
 * https://www.youtube.com/watch?v=4s-aG6yGGLU
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Быстрая сортировка");
        System.out.println("Входные данные: " + Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        QuickSort.quickSort(x, low, high);
        System.out.print("Итог: ");
        System.out.println(Arrays.toString(x));
    }
}
