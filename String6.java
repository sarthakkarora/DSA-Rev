// RomanToInteger


public class String6 {

    
    public static int valueOf(char roman) {

        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
            }
            }
   
    public static int romanToInt(String s) {
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int current = valueOf(s.charAt(i));
            if (i < s.length() - 1 && current < valueOf(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String roman1 = "III";  
        String roman2 = "LVIII";
        System.out.println("Roman numeral " + roman1 + " is " + romanToInt(roman1));
        System.out.println("Roman numeral " + roman2 + " is " + romanToInt(roman2));
    }
}