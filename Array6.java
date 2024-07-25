import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] arr = {11, 7, 3, 12, 4};
        int i = 0;
        int j = arr.length - 1;

        // Reverse the array
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print the reversed array twice
        System.out.println(Arrays.toString(arr));
        
    }
}
