class LengthofWord {
    public int LengthofLastWord(String s){
        String str[] =  s.trim().split("\\s+");
       if(str.length == 0){
         return 0;
       }
       else{
        return str[str.length-1].length();
       }



    }
    public static void main(String[] args) {
        String s = "Heelo world";

        
    }
}
