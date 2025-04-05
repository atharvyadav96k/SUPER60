package day3;

import java.util.*;

public class CF1877A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            for(int i=0;i<n-1;i++){
                int a = sc.nextInt();
                sum+=a;
            }
            int eff = - 1 * sum;
            System.out.println(eff);
        }
    }
}
