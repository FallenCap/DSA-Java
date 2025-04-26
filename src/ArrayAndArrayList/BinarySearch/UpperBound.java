/*The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than a given key*/

package ArrayAndArrayList.BinarySearch;

public class UpperBound {

    public static int findUpperBound(int[] nums, int x) {
        int start = 0;
           int end = nums.length - 1;
           int uBound = -1;
    
            while(start <= end) {
                int mid = start + (end - start) / 2;
    
                if(nums[mid] == x) {
                    start = mid + 1;
                } else if(nums[mid] > x) {
                    uBound = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
    
            return uBound;
        }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };

        System.out.println("Upper bound:" + findUpperBound(arr, 9));
    }
}
