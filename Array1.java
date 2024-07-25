// Subarray w given sum
public class Array1 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 3, 4, 9};
        int targetSum = 14;
        System.out.println(subarraySum(arr, targetSum));
    }

    public static String subarraySum(int[] arr, int targetSum) {
        int currentSum = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < arr.length; endIndex++) {
            currentSum += arr[endIndex];

            while (currentSum > targetSum && startIndex <= endIndex) {
                currentSum -= arr[startIndex];
                startIndex++;
            }

            if (currentSum == targetSum) {
                return "Bhai lessgoo hamara subarray sum milgya " + startIndex + " se lekar " + endIndex + " tak";
            }
        }

        return "ni mila";
    }
}
