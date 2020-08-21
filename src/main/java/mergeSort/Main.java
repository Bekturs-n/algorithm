package mergeSort;

import java.util.Arrays;

/**
 * Пример из ссылки:
 * https://javarush.ru/groups/posts/2202-sortirovka-slijaniem-merge-sort
 *
 * В примере источника имеется ошибка при создании второго временного массива.
 * Так же в методе mergeArray были не точности, поэтому merge реализован по иному алгоритму.
 *
 * Эти ошибки в моем примере исправлены, если найдете ошибку смело сообщайте, с радостью исправлю.
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 4, 8, 9, 13, 1};
        System.out.println("Сортировка слиянием: ");
        System.out.println("Входные данные: " + Arrays.toString(arr));
        System.out.print("Итог: ");
        System.out.println(Arrays.toString(MergeSort.sort(arr)));
    }
}
