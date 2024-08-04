// RemoveAdjacentDuplicates 

public class String4 {
    
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
 
        for (char currentChar : s.toCharArray()) {
          
            int length = result.length();

            if (length > 0 && result.charAt(length - 1) == currentChar) {
                result.deleteCharAt(length - 1);
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbacaadba";
        String result = removeDuplicates(input);
        System.out.println("Result after removing adjacent duplicates: " + result);
    }
}