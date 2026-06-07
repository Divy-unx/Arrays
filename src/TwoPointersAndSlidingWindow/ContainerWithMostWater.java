package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            int width = j - i;
            int h = Math.min(height[i], height[j]);

            int area = width * h;
            if(area > max){
                max = area;
            }
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(maxArea(nums));
    }
}
