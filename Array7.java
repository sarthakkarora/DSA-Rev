// Count pairs such that x^y > y^x

public class Array7 {

    public static void main(String[] args) {
        
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {1, 2, 3};

        
        int count = countPairs(arr1, arr2);

        System.out.println("Number of pairs : " + count);
    }

    public static int countPairs(int[] arr1, int[] arr2) {
        int count = 0;

       
        for (int x : arr1) {
            for (int y : arr2) {
                if (x != y) {
                    
                    if (y * Math.log(x) > x * Math.log(y)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
