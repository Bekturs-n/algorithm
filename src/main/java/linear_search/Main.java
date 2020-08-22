package linear_search;

/**
 * Линейный поиск - перебор элементов массива до тех пор пока не найдем нужный
 * <p>
 * Сложность: O(n);
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3,4,5,8,7,1}, 8));
    }

    public static int search(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.print("Искомое число лежит по индуксу: ");
                return i;
            }
        }
        System.out.println("Искоемого значения нет в массиве ");
        return 0;
    }
}
