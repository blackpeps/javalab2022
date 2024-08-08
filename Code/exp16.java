import java.util.*;
public class Test {
    public static void sort(String[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            sort(array, low, pivotIndex);
            sort(array, pivotIndex + 1, high);
        }
    }
    public static int partition(String[] array, int low, int high) {
        String pivot = array[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (array[i].compareTo(pivot) < 0);
            do {
                j--;
            } while (array[j].compareTo(pivot) > 0);
            if (i >= j) {
                return j;
            }
            swap(array, i, j);
        }
    }
    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the names separated by spaces:");
        String input = scanner.nextLine();
        String[] names = input.split(" ");
        sort(names, 0, names.length - 1);
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}
