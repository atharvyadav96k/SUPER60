package day2;

import java.util.*;

public class CF1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int arr[] = new int[n];
            boolean get = false;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i] == a){
                    get = true;
                    break;
                }
            }
            System.out.println(get ? "Yes" : "No");
        }
    }
}
