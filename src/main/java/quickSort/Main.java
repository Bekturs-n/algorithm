package quickSort;

import java.util.Arrays;

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
