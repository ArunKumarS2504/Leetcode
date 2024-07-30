import java.util.ArrayList;

public class list{    
    public static void main(String[] args) {
        
        ArrayList<Integer> alist =  new ArrayList<Integer>();

            for(int i=1;i<=10;i++){
                alist.add(i);
            }
            System.out.println(alist);

            ArrayList sist = new ArrayList();

            sist.add("ak");
            System.out.println(sist);
    }
}