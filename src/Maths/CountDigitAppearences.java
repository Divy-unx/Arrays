package Maths;

public class CountDigitAppearences {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int j : nums) {
            int num = j;
            while (num > 0) {
                int d = num % 10;
                if (d == digit) {
                    count++;
                }
                num = num / 10;
            }
        }
        return count;
    }
}
