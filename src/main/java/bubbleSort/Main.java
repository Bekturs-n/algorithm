package bubbleSort;

import java.util.Arrays;

/**
 * Сортировка пузырьком;
 * <p>
 * Сложность алгоритма: O(n^2);
 * <p>
 * Используется в учебных целях;
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Сортировка пузырьком первый вариант:");
        System.out.println("Входные данные: " + Arrays.toString(new int[]{5, 3, 9, 1, 2, 7}));
        System.out.println("Итог:");
        System.out.println(Arrays.toString(BubbleSort_v1.sort(new int[]{5, 3, 9, 1, 2, 7})));
        System.out.println("===============================================================");
        System.out.println("Сортировка пузырьком второй вариант:");
        System.out.println("Входные данные: " + Arrays.toString(new int[]{8, 3, 9, 5, 2, 7}));
        System.out.println("Итог:");
        System.out.println(Arrays.toString(BubbleSort_v2.sort(new int[]{8, 3, 9, 5, 2, 7})));
    }
}
