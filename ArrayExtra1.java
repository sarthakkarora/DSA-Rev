// Reverse
import java.util.Arrays;

public class ArrayExtra1 {
    public static void main(String[] args) {
        int[] arr = {11, 7, 3, 12, 4};
        int i = 0;
        int j = arr.length - 1;

        
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        
        System.out.println(Arrays.toString(arr));
        
    }
}
