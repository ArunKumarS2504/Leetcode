 class Palindrome {

    public static Boolean isPalindrome(String Str){

        String rev = "";
        Boolean ans = false;

        for(int i=Str.length()-1;i>=0;i--){
            rev = rev+Str.charAt(i);
            
        }
        if(Str.equals(rev)){
            ans = true;
    }
            return ans;

    }

    public static void main(String[] args) {
        String Str = "raceegcar";
        Str.toLowerCase();
        Boolean A = isPalindrome(Str);
        System.out.println(A);
    }
    
}
