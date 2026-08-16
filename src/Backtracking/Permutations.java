package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int f = factorial(n);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<f ; i++){
            int temp = i;
            List<Integer> remaining = new ArrayList<>();
            for (int num: nums){
                remaining.add(num);
            }

            List<Integer> current = new ArrayList<>();
            for(int div = n; div >= 1; div--){
                int q = temp / div;
                int r = temp % div;
                current.add(remaining.remove(r));
                temp = q;
            }
            result.add(current);
        }

        return result;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        Permutations p = new Permutations();
        List<List<Integer>> list = p.permute(nums);
        System.out.println(list);
    }
}
