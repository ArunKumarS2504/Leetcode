public class Queue {
    static  final int MAX_VAlUE=30;
    int front, rear;
    int arr[];
    
    Queue(){
        arr = new int[MAX_VAlUE];
        front = -1;
        rear = -1;
    }

   public void enqueue(int item){
        if(rear==MAX_VAlUE-1)
            throw new IndexOutOfBoundsException("Queue is full");
        if(front ==-1)
        front++;
        arr[++rear]=item;
    }


    public int dequeue(){
        if(front==-1||front>rear)
            throw new IndexOutOfBoundsException("Queue is Empty");
        return arr[front++];
    }
    public static void main(String[] args) {
        
        Queue q = new Queue();

        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println("Dequeued item :"+q.dequeue());

    }
}
