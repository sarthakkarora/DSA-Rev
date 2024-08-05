// Atoi 

public class String11 {
    

    public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int result = 0;
        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0'; 
            result = result * 10 + digit;
            i++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        String input1 = "32a";
        
        System.out.println(myAtoi(input1));
}
}