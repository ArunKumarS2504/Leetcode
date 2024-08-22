public class IntToRoman {
    public static String intToRoman(int num) {
        // Array of Roman numerals and their corresponding integer values
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through the values array
        for (int i = 0; i < values.length; i++) {
            // While the number is greater than or equal to the value at index i
            while (num >= values[i]) {
                result.append(romanNumerals[i]);
                num -= values[i];
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        int num = 1994;
        System.out.println("Roman numeral: " + intToRoman(num)); // Output: MCMXCIV
    }
}