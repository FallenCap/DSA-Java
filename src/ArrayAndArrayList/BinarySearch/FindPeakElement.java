package ArrayAndArrayList.BinarySearch;

public class FindPeakElement {

    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1) {
            return 0;
        }

        if (nums[start] > nums[start + 1]) {
            return start;
        } else if (nums[end] > nums[end - 1]) {
            return end;
        } else {
            start = start + 1;
            end = end - 1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };

        System.out.println("Min Element: " + findPeak(arr));
    }
}
