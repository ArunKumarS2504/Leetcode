public class Stack {
    
    int[] num = new int[10];
    int tos;

    Stack(){
        tos = -1;
    }
    
    void push(int item){
        if (tos==9) 
            System.out.println("Stack is full");
        else
            num[++tos]=item;
    }

    int pop(){
        if(tos>=0)
           return num[tos--];
          
        else
            System.out.println("Stack is empty");
            return -1;

    }


    public static void main(String[] args) {
        
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(3);
        s1.push(4);
        

        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}

