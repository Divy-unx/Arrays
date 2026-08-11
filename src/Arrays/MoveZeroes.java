package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroes {
        public static void moveZeroes(int[] nums) {
            int left = 0;
            int right = 0;

            while(right < nums.length){
                if(nums[right] != 0){
                    nums[left] = nums[right];
                    left++;
                }
                right++;
            }

            while(left < nums.length){
                nums[left++] = 0;
            }
        }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
