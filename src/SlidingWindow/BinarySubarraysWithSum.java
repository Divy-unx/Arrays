package SlidingWindow;

import java.util.Scanner;

public class BinarySubarraysWithSum {
    public static int atMost(int[] nums , int goal){
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while(right <= nums.length - 1){
            sum += nums[right];

            while(sum > goal){
                sum = sum - nums[left];
                left = left + 1;
            }

            count = count + (right - left + 1);
            right++;
        }
        return count;
    }

    public static int NiceSubarrays(int[] nums, int goal){
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int goal = sc.nextInt();

        System.out.println(NiceSubarrays(nums, goal));
    }
}
