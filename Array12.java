// Rev in grp

import java.util.*;
public class Array12 {
    public static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i= i+ k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int k = 4;

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        reverseInGroups(arr, k);

        System.out.println("Array after reversing in groups of " + k + ":");
        System.out.println(Arrays.toString(arr));
    }
}
