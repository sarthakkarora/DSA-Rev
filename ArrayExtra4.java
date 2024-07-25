import java.util.Arrays;

public class ArrayExtra4 {
    public static void main(String[] args) {
        int[] arr = {3, -5, -2, 1, -4, 2};

        rearrange(arr); 
        Arrays.sort(arr);
        int[] rearrangeArray = rearrangeAlternately(arr); 
        
        System.out.println("Rearranged Array: " + Arrays.toString(rearrangeArray));
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

    public static int[] rearrangeAlternately(int[] arr) {
        

        int[] result = new int[arr.length];
        int minIndex = 0; 
        int maxIndex = arr.length - 1; 

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
               
                result[i] = arr[minIndex];
                minIndex++;
            } else {
                
                result[i] = arr[maxIndex];
                maxIndex--;
            }
        }

        return result;
    }
}
