package PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

public class   BinarySubarrraysWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(map.containsKey(sum - goal)){
                count += map.get(sum - goal);
            }

            map.put(sum, map.getOrDefault(sum,0) + 1);
        }

        return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int goal = sc.nextInt();

        System.out.println(numSubarraysWithSum(nums, goal));
    }




}
