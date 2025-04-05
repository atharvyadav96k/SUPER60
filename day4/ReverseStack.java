// package day4;

// import java.util.Stack;

// public class ReverseStack {
//     static Stack<Integer> s = new Stack<>();
//     static void reverse(){
//         int a = s.pop();
//         if(!s.isEmpty()){
//             reverse();
//         }
//         s.push(a);
//     }
//     public static void main(String[] args) {
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
// }

import java.util.*;

package day4;

public class ReverseStack {
    static void rev(Stack<Integer> st){
        if(st.isEmpty()) return;
        int ele = st.pop();
        rev(st);
        insert(st,ele);
    }
    static void insert(Stack<Integer> st, int i){
        if(st.isEmpty()){
            st.push(i);
            return;
        }
        int ele = st.pop();
        insert(st, i);
        st.push(ele);
    }
    public static void main(String[] args) {
        
    }
}