// Kadane's Algorightm
// public class Array3 {
//     public static void main(String[] args) {
//         int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        
       
//         int sum = 0;
//         int maxi = arr[0];

        
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i]; 

            
//             maxi = Math.max(maxi, sum);

           
//             if (sum < 0) {
//                 sum = 0;
//             }
//         }

        
//         System.out.println("Maximum subarray sum is: " + maxi);
//     }
// }

public class Array3 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        
        int currentSum = arr[0];
        int maxSum = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            
            if (currentSum < 0) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

  
        System.out.println("Maximum subarray sum is: " + maxSum);
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
}
