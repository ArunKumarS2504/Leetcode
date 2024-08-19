class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            ans.append(word[i]+" ");
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        s = " the sky is blue ";
        Solution sol = new Solution();
        String reverse = sol.reverseWords(s);
        System.out.println(reverse);
    }
}