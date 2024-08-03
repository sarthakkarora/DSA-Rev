// LongestSubstring
public class StringExtra1 {
    public static int lengthOfLongestSubstring(String s) {

        int[] charIndexArray = new int[256];
        
        for (int i = 0; i < 256; i++) {
            charIndexArray[i] = -1;
        }

        int maxLength = 0; 
        int left = 0; 

        
        for (int right = 0; right < s.length(); right++) {
            
            char currentChar = s.charAt(right);

            if (charIndexArray[currentChar] >= left) {
                left = charIndexArray[currentChar] + 1;
            }

            charIndexArray[currentChar] = right;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: "  + lengthOfLongestSubstring(input));
    }
}
