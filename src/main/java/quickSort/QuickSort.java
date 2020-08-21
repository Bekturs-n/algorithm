package quickSort;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

//      выбор пивота из несколькиз значений значительно ускорят процесс
//      https://www.youtube.com/watch?v=4s-aG6yGGLU
        int pivot = low + (high - low) / 2;
        int wall = array[pivot];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < wall) {
                i++;
            }

            while (array[j] > wall) {
                j--;
            }

            if (i <= j) {
                int c = array[i];
                array[i] = array[j];
                array[j] = c;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
