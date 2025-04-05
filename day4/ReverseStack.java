package day4;

import java.util.Stack;

public class ReverseStack {
    static Stack<Integer> s = new Stack<>();
    static void reverse(){
        int a = s.pop();
        if(!s.isEmpty()){
            reverse();
        }
        s.push(a);
    }
    public static void main(String[] args) {
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
