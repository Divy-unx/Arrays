package PrefixSum;
import java.util.Scanner;

public class FindPivotIndex {

    public static int pivot(int[] nums){
        int n = nums.length;
        int sum = 0;
        int left = 0;

        for (int num : nums) {
            sum = sum + num;
        }
        for(int i = 0; i < n; i++){

            int right = sum - nums[i] - left;

            if(left == right){
                return i;
            }
            left = left + nums[i];
        }

        return -1;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        int ans = pivot(nums);
        System.out.println(ans);
    }
}
