/*The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key */

package ArrayAndArrayList.BinarySearch;

public class LowerBound {
    public static int findLowerBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int lBound = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= x) {
                lBound = mid;
                end = mid - 1;
            } else if (nums[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return lBound;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };

        System.out.println("Lower bound:" + findLowerBound(arr, 9));
    }
}
