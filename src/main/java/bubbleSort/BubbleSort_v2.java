package bubbleSort;

public class BubbleSort_v2 {
    public static int[] sort(int[] array) {
        int i = 0;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                    flag = true;
                }
            }
            i++;
        }
        return array;
    }
}
