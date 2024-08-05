//  RemoveDuplicates

import java.util.*;

public class String8 {

    public static String removeDuplicates(String s) {
        
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 || charArray[i] != charArray[i - 1]) {
                result.append(charArray[i]);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbacaadba";
        String result = removeDuplicates(input);
        System.out.println("Result after removing duplicates: " + result);
    }
}
