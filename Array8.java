// Sort 0,1,2

import java.util.Arrays;

public class Array8 {

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0, 0, 2, 1};
        sort012(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], increment both
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Just move to the next element
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    // Utility method to swap elements at two indices
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
