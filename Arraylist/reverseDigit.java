
class reverseDigit {
    public int reverse(int x) {
         int reversed = 0;

        while (x != 0) {
            int digit = x % 10;  
            x /= 10;             

            // Check for overflow/underflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;  
        }

        return reversed;
    }
    public class Main {
        public static void main(String[] args) {
            reverseDigit rev = new reverseDigit();
    
            // Test cases
            int num1 = 123;
            System.out.println("Input: " + num1 + ", Reversed: " + rev.reverse(num1)); // Expected Output: 321
    
            int num2 = -123;
            System.out.println("Input: " + num2 + ", Reversed: " + rev.reverse(num2)); // Expected Output: -321
    
            int num3 = 120;
            System.out.println("Input: " + num3 + ", Reversed: " + rev.reverse(num3)); // Expected Output: 21
    
            int num4 = 0;
            System.out.println("Input: " + num4 + ", Reversed: " + rev.reverse(num4)); // Expected Output: 0
    
            int num5 = 1534236469; // This case will test overflow
            System.out.println("Input: " + num5 + ", Reversed: " + rev.reverse(num5)); // Expected Output: 0
    
            int num6 = -2147483648; // This case will test underflow
            System.out.println("Input: " + num6 + ", Reversed: " + rev.reverse(num6)); // Expected Output: 0
        }
    }
}