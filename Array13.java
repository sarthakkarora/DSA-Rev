// K'th shortest element

import java.util.*;
public class Array13 {
    

    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("K'th smallest element is " + findKthSmallest(arr, k));
    }
}
