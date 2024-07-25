// rearrange array elements (-ve first)
import java.util.Arrays;

public class ArrayExtra3 {
    public static void main(String[] args) {
        int[] arr = {3, -5, -2, 1, -4, 2};

        rearrange(arr);
        Arrays.sort(arr);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                
                j++;
            }
        }
    }
}
