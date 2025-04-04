import java.util.*;

class Queue {

    private int arr[];
    private int front;
    private int last;

    public Queue(int cap) {
        arr = new int[cap];
        front = 0;
        last = 0;
    }

    public Queue() {
        arr = new int[5];
        front = 0;
        last = 0;
    }

    public boolean isEmpty() {
        if (last == 0) {
            return true; 
        }else {
            return false;
        }
    }

    public boolean isFull() {
        if (last == arr.length) {
            return true; 
        }else {
            return false;
        }
    }

    public void push(int elm) throws Exception {
        if (isFull()) {
            throw new Exception("Cant push");
        }
        arr[(front + last) % arr.length] = elm;
        last++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cant pop");
        }
        int elm = arr[front];
        front = (front + 1) % arr.length;
        return elm;
    }

    public void Display() {
        int[] displayArr = Arrays.copyOfRange(arr, 0, top);
        System.out.println(Arrays.toString(displayArr));

    }

    public static void main(String[] args) {
        try {
            Queue q = new Queue();

            q.push(15);
            q.push(47);
            q.push(100);
            q.Display();
            q.push(567);
            q.push(16);
            q.Display();
            q.pop();
            q.Display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
