import java.util.Arrays;

public class QuickSort {
    static int pivote(int arr[], int left,int ei){
        int ele = arr[ei];
        int pi = left;
        for(int i=left;i<ei;i++){
            if(ele > arr[i]){
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp;
        return  pi;
    }
    static void sort(int[] arr, int left, int ei){
        if(left > ei) {
            return;
        }
            int pi = pivote(arr, left, ei);
            sort(arr, left, pi-1);
            sort(arr, pi+1,ei);
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 1, 3, 5, 4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}