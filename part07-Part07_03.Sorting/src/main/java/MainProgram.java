
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMin = indexOfSmallestFrom(array, i);

            swap(array, i, indexOfMin);

            System.out.println(Arrays.toString(array));
        }

    }

}
