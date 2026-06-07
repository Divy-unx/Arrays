package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] nums, int pivot,int low, int high){
        int i = low;
        int j = low;
        // unknown pivot -> i to end
        // <= pivot -> 0 to j - 1
        // > pivot -> j to i - 1

        while(i < high){
            if (nums[i] > pivot){
                i++;
            }else{
                swap(nums,i,j);
                i++;
                j++;
            }
        }
        swap(nums, j,high);
        return j;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void quickSort(int[] nums, int low, int high){
        //base condition
        if (low >= high){
            return;
        }

        int pivot = nums[high];
        int pivotIndex = partition(nums,pivot,low,high);
        quickSort(nums,low,pivotIndex - 1);
        quickSort(nums,pivotIndex + 1,high);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        quickSort(nums,0, nums.length - 1);

        for (int num: nums){
            System.out.print(num + " ");
        }

    }
}
