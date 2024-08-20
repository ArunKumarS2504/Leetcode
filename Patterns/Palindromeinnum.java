
class Palindromeinnum {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse=0;
        int original=x;
        while(x!=0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x /= 10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Palindromeinnum pali = new Palindromeinnum();
        int[] testcases = {-121,121,10,343343,65,76767};
        for(int testCase:testcases){
            boolean result = pali.isPalindrome(testCase);
            System.out.println(testCase+" "+ result);
        }
        }

}