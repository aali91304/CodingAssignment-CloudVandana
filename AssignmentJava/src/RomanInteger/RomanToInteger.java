package RomanInteger;
import java.util.HashMap;
import java.util.Map;


public class RomanToInteger {
    public static int romanToInt(String s) {
        // Map to store Roman numerals and their corresponding values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int length = s.length();

        // Loop through the string of Roman numerals
        for (int i = 0; i < length; i++) {
            int currentValue = romanMap.get(s.charAt(i));

            // If next value exists and is greater than current, subtract current value
            if (i + 1 < length && romanMap.get(s.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Example: Convert "IX" to 9
        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of Roman numeral " + romanNumeral + " is: " + result);
    }
}
