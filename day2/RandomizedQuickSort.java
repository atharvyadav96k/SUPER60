package day2;
import java.util.*;

public class QuickSort {
    static int pivot(int arr[], int left, int ei) {
        Random r = new Random();
        int pi = r.nextInt(ei - left + 1) + left;  
        int temp = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp; 

        int ele = arr[ei]; 
        pi = left;

        for (int i = left; i < ei; i++) {
            if (arr[i] < ele) { 
                int temp2 = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp2;
                pi++;
            }
        }

        int temp3 = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp3;

        return pi;
    }

    static void sort(int[] arr, int left, int ei) {
        if (left >= ei) {
            return; 
        }

        int pi = pivot(arr, left, ei); 
        sort(arr, left, pi - 1);       
        sort(arr, pi + 1, ei);         
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 1, 3, 5, 4};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
