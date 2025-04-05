package day4;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6 ,3, 1, 5, 4, 6};
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                int idx = s.pop();
                arr[idx] = arr[i];
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int idx = s.pop();
            arr[idx] = -1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
