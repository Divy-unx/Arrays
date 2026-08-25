package TwoPointersAndSlidingWindow;

//You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.
//
//
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//
//Output: [0,0,1,1,2,2]
//
//Explanation:
//
//The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

import java.util.Scanner;

public class SortColors {
    public static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public static void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;

        while(j <= k){
            if(nums[j] == 1){
                j++;
            }else if(nums[j] == 0){
                swap(nums,j,i);
                i++;
                j++;
            }else{
                swap(nums, j,k);
                k--;
            }
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        sortColors(nums);
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
