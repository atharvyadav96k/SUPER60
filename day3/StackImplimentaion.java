package day3;

class Stack {

    private int top = 0;
    private int arr[];

    Stack(int size) {
        this.arr = new int[size];
    }

    Stack() {
        this.arr = new int[5];
    }

    void push(int val) throws Exception {
        if (top == arr.length) {
            throw new Exception("Tu thoda pagal vagal he kya?");
        }
        arr[top] = val;
        top++;
    }

    int pop() throws Exception {
        if (top <= 0) {
            throw new Exception("Bhang vang pi ke aaya he kya?");
        }
        System.out.println(this.topVal());;
        top--;
        int val = arr[top];

        return val;
    }

    int topVal() throws Exception {
        if (0 >= top - 1) {
            throw new Exception("Mother Father");
        }
        return arr[top - 1];
    }
}

public class StackImplimentaion {

    public static void main(String[] args) {
        Stack s = new Stack();
        try {
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        } catch (Exception e) {
        }
    }
}
