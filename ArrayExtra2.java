
import java.util.Arrays;

// Merge two Sorted Arrays Without Extra Space
public class ArrayExtra2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};

        System.out.println("arr 1: "+ Arrays.toString(arr1));

        System.out.println("arr 2:" + Arrays.toString(arr2));

        merge(arr1,arr2); 


        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));
    }

    public static void merge(int[] arr1, int[] arr2) {
        int i= arr1.length-1;
        int j=arr2[0];

        while (i>=0 && j<arr1.length){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i]=arr2[j];
                arr2[j]= temp;
            }
            i--;
            j++;
        }

                Arrays.sort(arr1);
                Arrays.sort(arr2);
            }
        }
