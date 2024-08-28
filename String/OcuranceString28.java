 class OcuranceString28 {
        public int Strstr(String haystack, String needle){
        if(needle.isEmpty()){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }

        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       String haystack = "leetcode";
       String needle = "code";

        OcuranceString28 str = new OcuranceString28();
      int s = str.Strstr(haystack, needle)

      System.out.println(s);
        
    }
}
