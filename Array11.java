import java.util.Arrays;

public class Array11 {
    public static void main(String[] args) {
        int[] ari = {900, 940, 950, 1100, 1500, 1800};
        int[] dep ={910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("Minimum number of platforms required: " + findMinimumPlatforms(ari, dep));
   
    }
    public static int findMinimumPlatforms(int[] ari, int[] dep) {
      int n = ari.length;
        Arrays.sort(ari);
        Arrays.sort(dep);

         int i = 0, j = 0;
         int platformsNeeded = 0, maxPlatforms = 0;
         while (i < n && j < n) {
            // If next event in sorted order is arrival, increment platforms needed
            if (ari[i] <= dep[j]) {
                platformsNeeded++;
                i++;
                // Update maximum platforms needed
                if (platformsNeeded > maxPlatforms) {
                    maxPlatforms = platformsNeeded;
                }
            } else {
                // If next event is departure, decrement platforms needed
                platformsNeeded--;
                j++;
            }
        }

        return maxPlatforms;
    }
    }
