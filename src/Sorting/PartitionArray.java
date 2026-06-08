package Sorting;

import java.util.Scanner;

public class PartitionArray {
    public static void partition(int[] nums, int pivot){
        int i = 0;
        int j = 0;
        // unknown pivot -> i to end
        // <= pivot -> 0 to j - 1
        // > pivot -> j to i - 1

        while(i < nums.length){
            if (nums[i] > pivot){
                i++;
            }else{
                swap(nums,i,j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        int pivot = scanner.nextInt();
        partition(nums, pivot);
        for (int val : nums) {
            System.out.print(val + " ");
        }

    }
}
