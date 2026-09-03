package Arrays;

import java.util.Scanner;

public class SumOfAllOddLengthSubarrays {
    public static int OddLengthSubarray(int[] nums){
        int sum = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                length = j - i + 1;
                if (length % 2 == 1 ){
                    for (int k = i; k <= j; k++){
                        sum = sum + nums[k];
                    }

               }
            }
        }

        return sum;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(OddLengthSubarray(nums));
    }
}
