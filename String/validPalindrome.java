class validPalindrome {
    public boolean isPalindrome(String s) {
        String A = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        StringBuilder rev = new StringBuilder();
        boolean ans = false;

        for(int i =A.length()-1;i>=0;i-- ){
            rev.append(A.charAt(i));
        }
        if(A.equals(rev.toString())){
            ans = true;
        }
         return ans;
    }
    public static void main(String[] args) {
        validPalindrome val = new validPalindrome();
        String s = "A man, a plan, a canal: Panama";

      System.out.println(val.isPalindrome(s));

    }
}