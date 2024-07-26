public class Array9 {

    public static int findEquilibriumIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int equilibriumIndex = findEquilibriumIndex(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index found at: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}