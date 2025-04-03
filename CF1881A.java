package day2;
import java.util.Scanner;

public class CF1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int f = sc.nextInt();
            int s = sc.nextInt();
            String first = sc.next();
            String second = sc.next();
            int count = 0;
            boolean ansGet = false;
            for(int i=0;i<6;i++){
                if(first.contains(second)){
                    ansGet=true;
                    break;
                }
                first = first + first;
                count++;
            }
            System.out.println(ansGet == true ? count : -1);
        }        
    }
}
