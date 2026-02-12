package ArrayAndArrayList.BinarySearch;

public class SmallestDivisorInThreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1, end = findMax(nums), ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = sumOfDivision(nums, mid);
            if (threshold >= sum) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int sumOfDivision(int[] nums, int divisor) {
        int result = 0;
        for (int n : nums) {
            result += (n + divisor - 1) / divisor;
        }
        return result;
    }

    public static int findMax(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int b : bloomDay) {
            max = Math.max(b, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
