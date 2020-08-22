package binary_search;

/**
 * Сложность: O(log n);
 */
public class Main {
    public static void main(String[] args) {
//        Бинарный поиск будет работать только на отсортированных/поиндексированных данных
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(arr, 1));
    }

    public static int search(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (n == arr[mid]) {
                System.out.print("Искомое число лежит по индуксу: ");
                return mid;
            } else if (n > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Искоемого значения нет в массиве ");
        return 0;
    }
}
