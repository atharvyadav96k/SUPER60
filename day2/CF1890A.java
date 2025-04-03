package day2;
import java.util.*;
public class CF1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int first = 0;
            int second = 0;
            int fCount = 0;
            int sCount = 0;
            int tCount = 0;
            for(int i=0;i<n;i++){
                if(first == 0 || first == arr[i]){
                    first = arr[i];
                    fCount++;
                }else if(second == 0 || second == arr[i]){
                    second = arr[i];
                    sCount++;
                }else{
                    tCount = 1;
                    break;
                }
            }
            if(tCount == 1){
                System.out.println("No");
            }else if(second == 0){
                System.out.println("Yes");
            }else if(n%2== 0 && Math.abs(fCount - sCount) == 0){
                System.out.println("Yes");
            }else if(n%2 == 1 && Math.abs(fCount - sCount) == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
