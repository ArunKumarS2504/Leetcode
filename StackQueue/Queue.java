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

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == MAX_VALUE - 1;
    }    

      // Method to get the front element of the queue without removing it
      public int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Queue is empty");
        return arr[front];
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
