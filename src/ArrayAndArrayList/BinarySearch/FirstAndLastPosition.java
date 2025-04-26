package ArrayAndArrayList.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        return new int[] {first, last};
    }

    static int findPosition(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int pos = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                pos = mid;
                if(isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int key = sc.nextInt();

        System.out.println("ans: " + Arrays.toString(searchRange(arr, key)));
        sc.close();
    }
}
