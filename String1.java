public class String1 {
    public static void main(String[] args) {
        String input = "Hello world from Java";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }

    public static String reverseWords(String str) {
        
        String[] words = str.split(" ");
        
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
