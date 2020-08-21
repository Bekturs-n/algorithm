package mergeSort;

public class MergeSort {

    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int[] temp1 = new int[arr.length / 2];
        System.arraycopy(arr, 0, temp1, 0, arr.length / 2);

        int[] temp2 = new int[(int) Math.ceil((float) arr.length / 2)];

        System.arraycopy(arr, arr.length / 2, temp2, 0, arr.length - arr.length / 2);

        temp1 = sort(temp1);
        temp2 = sort(temp2);

        return merge(temp1, temp2);
    }

    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
        int index1 = 0, index2 = 0, index3 = 0;

        while (index1 < a.length && index2 < b.length) {
            if (a[index1] < b[index2]) {
                result[index3++] = a[index1++];
            } else {
                result[index3++] = b[index2++];
            }
        }

        while (index1 < a.length)
            result[index3++] = a[index1++];

        while (index2 < b.length)
            result[index3++] = b[index2++];

        return result;
    }
}
