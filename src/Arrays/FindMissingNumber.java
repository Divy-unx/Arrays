package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class FindMissingNumber {
    public static List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int min = nums[0];
        int max = nums[nums.length-1];

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for(int j = min; j <= max; j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }
        return list;

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findMissingElements(nums));
    }
}
