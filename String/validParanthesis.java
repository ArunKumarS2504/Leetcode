import java.util.Stack;
class validParanthesis {
    public boolean isValid(String s) {
       Stack<Character> s1 = new Stack<>();

       for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c=='('||c=='{'||c=='['){
            s1.push(c);
        }
        else if(c==')'||c=='}'||c==']'){
           if(s1.isEmpty()){
            return false;
           }
           char top = s1.pop();
           
           if((c==')'&& top != '(')||
            (c=='}'&& top != '{')||
            (c==']'&& top != '[')){
                return false;
            }
        }
        

       }
      return s1.isEmpty(); 
    }
    public static void main(String[] args) {
        validParanthesis paranthe = new validParanthesis();
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";
        String test6 = "({[()]})";
        String test7 = "{[}";

        System.out.println(paranthe.isValid(test1));
        System.out.println(paranthe.isValid(test2));
        System.out.println(paranthe.isValid(test3));
        System.out.println(paranthe.isValid(test4));
        System.out.println(paranthe.isValid(test5));
        System.out.println(paranthe.isValid(test6));
        System.out.println(paranthe.isValid(test7));
    }
}