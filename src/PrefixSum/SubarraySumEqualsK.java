package PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
        public static int subarraySum(int[] nums, int k) {
            int ans = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0,1);

            int sum = 0;

            for (int num : nums) {
                sum += num;

                if (map.containsKey(sum - k)) {
                    ans += map.get(sum - k);
                }

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return ans;
        }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(subarraySum(nums,k));


    }
}
