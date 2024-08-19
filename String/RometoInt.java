
import java.util.Map;
import java.util.HashMap;
class RometiInt {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n=0;

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(i+1 <s.length() && map.get(s.charAt(i+1))>map.get(c)){
                n += map.get(s.charAt(i+1)) - map.get(c);
                i +=1;
            }else{
                n += map.get(c);
            }
        }
        return n;

    }
    public static void main(String[] args) {
        String s1 ="III";
        String s2  = "MCMXCIV";
        String s3 = "LVIII";
        RometiInt romen = new RometiInt();
        int num = romen.romanToInt(s1);
        int num2 = romen.romanToInt(s2);
        int num3 = romen.romanToInt(s3);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }
}
