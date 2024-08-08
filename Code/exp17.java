import java.util.*;
public class Test {
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Enter the number you want to search:");
        int value = scanner.nextInt();
        int result = binarySearch(array, value);
        if (result == -1) {
            System.out.println("Number not found in the array");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }
}
