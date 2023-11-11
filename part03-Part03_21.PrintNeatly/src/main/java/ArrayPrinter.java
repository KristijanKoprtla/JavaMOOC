
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2, 5};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int lastIndex = array.length - 1;
        int i = 0;
        for (int num : array) {
            System.out.print(num);

            if (i < lastIndex) {
                System.out.print(", ");
            }
            i++;

        }
    }
}
