package ArrayAndArrayList.BinarySearch;

public class SingleElementSortedArray {

    static int findElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums.length == 1) {
            return nums[0];
        } else if (nums[start] != nums[start + 1]) {
            return nums[start];
        } else if (nums[end] != nums[end - 1]) {
            return nums[end];
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                } else if ((mid % 2 == 1 && nums[mid] == nums[mid - 1])
                        || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

        System.out.println("Min Element: " + findElement(arr));
    }
}
