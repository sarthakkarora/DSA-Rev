// Count the triplet
import java.util.*;

public class Array2 {
    public static int countTriplets(int[] arr, int N) {
        int count = 0;
        Arrays.sort(arr);

        for (int k = 0; k < N; k++) {
            int targetSum = arr[k];
            int i = 0;
            int j = N - 1;

            while (i < j) {
                if (i == k) {
                    i++;
                    continue;
                }
                if (j == k) {
                    j--;
                    continue;
                }

                int sum = arr[i] + arr[j];
                if (sum == targetSum) {
                    
                    System.out.println("Triplet found: (" + arr[i] + ", " + arr[j] + ", " + targetSum + ")");
                    count++;
                    i++;
                    j--;
                } else if (sum < targetSum) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = arr.length;
        System.out.println("Number of triplets: " + countTriplets(arr, N));
    }
}
