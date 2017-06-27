package br.com.diegogusava.algorithms.problems.selection;

import java.util.Random;

public class QuickSelect {

    private static final Random RANDOM = new Random();

    public static int select(int[] array, int k) {
        return select(array, 0, array.length - 1, k - 1);
    }

    private static int select(int[] array, int firstIndex, int lastIndex, int k) {
        int pivot = partition(array, firstIndex, lastIndex, k);

        if (pivot > k) {
            return select(array, firstIndex, pivot - 1, k);
        } else if (pivot < k) {
            return select(array, pivot + 1, lastIndex, k);
        }

        return array[k];
    }

    private static int partition(int[] array, int firstIndex, int lastIndex, int k) {

        int pivot = RANDOM.nextInt(lastIndex - firstIndex + 1) + firstIndex;

        swap(array, lastIndex, pivot);

        for (int i = firstIndex; i < lastIndex; i++) {
            if (array[i] > array[lastIndex]) {
                swap(array, i, firstIndex);
                firstIndex++;
            }
        }

        swap(array, firstIndex, lastIndex);

        return firstIndex;
    }

    public static void swap(int[] array, int i, int j) {
        final int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
