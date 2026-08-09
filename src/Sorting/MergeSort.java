package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int low, int high){
        if(low == high){
            int[] ba = new int[1];
            ba[0] = arr[low];
            return ba;
        }
        int mid = (low + high) / 2;

        int[] fsh = mergeSort(arr, low, mid);
        int[] ssh = mergeSort(arr,mid + 1, high );
        return mergeTwoSortedArray(fsh, ssh);
    }
    public static int[] mergeTwoSortedArray(int[] a, int[] b){
        System.out.println("Merging Two Arrays...");
        System.out.println("First Array: " + Arrays.toString(a));
        System.out.println("Second Array: " + Arrays.toString(b));

        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            }else{
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < a.length){
            ans[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
         int low = 0;
        int high = arr.length - 1;

        int[] ans = mergeSort(arr, low, high);
        System.out.println(Arrays.toString(ans));

    }
}
