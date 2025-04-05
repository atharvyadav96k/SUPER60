import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s[] = new String[10];
            for(int i=0;i<10;i++){
                s[i] = sc.next();
            }
            int total = 0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    int r = i < 5 ? i : 9 - i;
                    int c = j < 5 ? j : 9 - j;
                    if(s[i].charAt(j) == 'X'){
                        total += Math.min(r,c)+1;
                    }
                }
            }
            System.out.println(total);
        }
    }
}
