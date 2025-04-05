package day3;

import java.util.Arrays;

class Stack {

    private int top = 0;
    protected  int arr[];

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
    boolean isFull(){
        if(top == arr.length) return  true;
        return false;
    }
    int topVal() throws Exception {
        if (0 >= top - 1) {
            throw new Exception("Mother Father");
        }
        return arr[top - 1];
    }
}
class DynamicStack extends  Stack{
    @Override
    public void push(int ele) throws Exception{
        if(isFull()){
            int newArray[] = new int[2*arr.length];
            for(int i=0;i<arr.length;i++){
                newArray[i] = arr[i];
            }
            arr = newArray;
            System.out.println(Arrays.toString(arr));
        }
        super.push(ele);
    }
}
public class DyamicStackImplimentation {

    public static void main(String[] args) {
        DynamicStack s = new DynamicStack();
        try {
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
        } catch (Exception e) {
        }
    }
}
