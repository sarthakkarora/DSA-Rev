public class Array4 {
    public static int missingNumber(int n, int[] arr)
    {
        int sum = 0;

        
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        
        int expectedSum = (n * (n + 1)) / 2;

        return expectedSum - sum;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }
    
}
